/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.07.31 at 11:10:09 AM IST
//


package org.apache.xml.security.binding.xmldsig11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.apache.xml.security.binding.xmldsig11 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ECKeyValue_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "ECKeyValue");
    private final static QName _SM2KeyValue_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "SM2KeyValue");
    private final static QName _Prime_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "Prime");
    private final static QName _GnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "GnB");
    private final static QName _TnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "TnB");
    private final static QName _PnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "PnB");
    private final static QName _OCSPResponse_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "OCSPResponse");
    private final static QName _DEREncodedKeyValue_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "DEREncodedKeyValue");
    private final static QName _KeyInfoReference_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "KeyInfoReference");
    private final static QName _X509Digest_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "X509Digest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.xml.security.binding.xmldsig11
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ECKeyValueType }
     *
     */
    public ECKeyValueType createECKeyValueType() {
        return new ECKeyValueType();
    }

    /**
     * Create an instance of {@link SM2KeyValueType}
     */
    public SM2KeyValueType createSM2KeyValueType() {
        return new SM2KeyValueType();
    }

    /**
     * Create an instance of {@link PrimeFieldParamsType }
     *
     */
    public PrimeFieldParamsType createPrimeFieldParamsType() {
        return new PrimeFieldParamsType();
    }

    /**
     * Create an instance of {@link CharTwoFieldParamsType }
     *
     */
    public CharTwoFieldParamsType createCharTwoFieldParamsType() {
        return new CharTwoFieldParamsType();
    }

    /**
     * Create an instance of {@link TnBFieldParamsType }
     *
     */
    public TnBFieldParamsType createTnBFieldParamsType() {
        return new TnBFieldParamsType();
    }

    /**
     * Create an instance of {@link PnBFieldParamsType }
     *
     */
    public PnBFieldParamsType createPnBFieldParamsType() {
        return new PnBFieldParamsType();
    }

    /**
     * Create an instance of {@link DEREncodedKeyValueType }
     *
     */
    public DEREncodedKeyValueType createDEREncodedKeyValueType() {
        return new DEREncodedKeyValueType();
    }

    /**
     * Create an instance of {@link KeyInfoReferenceType }
     *
     */
    public KeyInfoReferenceType createKeyInfoReferenceType() {
        return new KeyInfoReferenceType();
    }

    /**
     * Create an instance of {@link X509DigestType }
     *
     */
    public X509DigestType createX509DigestType() {
        return new X509DigestType();
    }

    /**
     * Create an instance of {@link NamedCurveType }
     *
     */
    public NamedCurveType createNamedCurveType() {
        return new NamedCurveType();
    }

    /**
     * Create an instance of {@link ECParametersType }
     *
     */
    public ECParametersType createECParametersType() {
        return new ECParametersType();
    }

    /**
     * Create an instance of {@link FieldIDType }
     *
     */
    public FieldIDType createFieldIDType() {
        return new FieldIDType();
    }

    /**
     * Create an instance of {@link CurveType }
     *
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link ECValidationDataType }
     *
     */
    public ECValidationDataType createECValidationDataType() {
        return new ECValidationDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECKeyValueType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "ECKeyValue")
    public JAXBElement<ECKeyValueType> createECKeyValue(ECKeyValueType value) {
        return new JAXBElement<ECKeyValueType>(_ECKeyValue_QNAME, ECKeyValueType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "SM2KeyValue")
    public JAXBElement<SM2KeyValueType> createECKeyValue(SM2KeyValueType value) {
        return new JAXBElement<SM2KeyValueType>(_SM2KeyValue_QNAME, SM2KeyValueType.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeFieldParamsType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "Prime")
    public JAXBElement<PrimeFieldParamsType> createPrime(PrimeFieldParamsType value) {
        return new JAXBElement<PrimeFieldParamsType>(_Prime_QNAME, PrimeFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharTwoFieldParamsType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "GnB")
    public JAXBElement<CharTwoFieldParamsType> createGnB(CharTwoFieldParamsType value) {
        return new JAXBElement<CharTwoFieldParamsType>(_GnB_QNAME, CharTwoFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TnBFieldParamsType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "TnB")
    public JAXBElement<TnBFieldParamsType> createTnB(TnBFieldParamsType value) {
        return new JAXBElement<TnBFieldParamsType>(_TnB_QNAME, TnBFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnBFieldParamsType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "PnB")
    public JAXBElement<PnBFieldParamsType> createPnB(PnBFieldParamsType value) {
        return new JAXBElement<PnBFieldParamsType>(_PnB_QNAME, PnBFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "OCSPResponse")
    public JAXBElement<byte[]> createOCSPResponse(byte[] value) {
        return new JAXBElement<byte[]>(_OCSPResponse_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEREncodedKeyValueType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "DEREncodedKeyValue")
    public JAXBElement<DEREncodedKeyValueType> createDEREncodedKeyValue(DEREncodedKeyValueType value) {
        return new JAXBElement<DEREncodedKeyValueType>(_DEREncodedKeyValue_QNAME, DEREncodedKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoReferenceType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "KeyInfoReference")
    public JAXBElement<KeyInfoReferenceType> createKeyInfoReference(KeyInfoReferenceType value) {
        return new JAXBElement<KeyInfoReferenceType>(_KeyInfoReference_QNAME, KeyInfoReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DigestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "X509Digest")
    public JAXBElement<X509DigestType> createX509Digest(X509DigestType value) {
        return new JAXBElement<X509DigestType>(_X509Digest_QNAME, X509DigestType.class, null, value);
    }

}
