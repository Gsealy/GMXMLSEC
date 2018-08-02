/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 */
/*
 * $Id: DigesterOutputStream.java, v 1.5 2005/12/20 20:02:39 mullan Exp $
 */
package org.apache.jcp.xml.dsig.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;
import cn.com.infosec.gmssl.GmSSL;

/**
 * modified the DigesterOutputStream, to support the GmSSL.
 *
 */
public class DigesterOutputStream_GmSSL extends OutputStream {
  private static final org.slf4j.Logger LOG =
      org.slf4j.LoggerFactory.getLogger(DigesterOutputStream_GmSSL.class);

  private final String digestAlg = "SM3";
  private final boolean buffer;
  private UnsyncByteArrayOutputStream bos;
  private final GmSSL gmssl;

  // 替换原有MessageDigest的update, 直接做GmSSL的digest
  private byte[] update;

  /**
   * Creates a DigesterOutputStream.
   *
   * @param md the MessageDigest
   */
  public DigesterOutputStream_GmSSL(GmSSL gmssl) {
    this(gmssl, false);
  }

  /**
   * Creates a DigesterOutputStream.
   *
   * @param md the MessageDigest
   * @param buffer if true, caches the input bytes
   */
  public DigesterOutputStream_GmSSL(GmSSL gmssl, boolean buffer) {
    this.gmssl = gmssl;
    this.buffer = buffer;
    if (buffer) {
      bos = new UnsyncByteArrayOutputStream();
    }
  }

  public void write(int input) {
    if (buffer) {
      bos.write(input);
    }
    byte[] cache = new byte[1];
    cache[0] = (byte) input;
    this.update = cache;
  }

  @Override
  public void write(byte[] input, int offset, int len) {
    if (buffer) {
      bos.write(input, offset, len);
    }
    if (LOG.isDebugEnabled()) {
      LOG.debug("Pre-digested input:");
      StringBuilder sb = new StringBuilder(len);
      for (int i = offset; i < (offset + len); i++) {
        sb.append((char) input[i]);
      }
      // LOG.debug(sb.toString());
    }
    // TODO update sub
    this.update = input;
  }

  /**
   * @return the digest value
   */
  public synchronized byte[] getDigestValue() {
    return gmssl.digest(digestAlg, update);
  }

  /**
   * @return an input stream containing the cached bytes, or null if not cached
   */
  public InputStream getInputStream() {
    if (buffer) {
      return new ByteArrayInputStream(bos.toByteArray());
    } else {
      return null;
    }
  }

  @Override
  public void close() throws IOException {
    if (buffer) {
      bos.close();
    }
  }
}
