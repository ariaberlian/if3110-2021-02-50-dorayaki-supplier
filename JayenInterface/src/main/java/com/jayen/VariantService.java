/**
 * VariantService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jayen;

public interface VariantService extends javax.xml.rpc.Service {
    public java.lang.String getVariantAddress();

    public com.jayen.Variant getVariant() throws javax.xml.rpc.ServiceException;

    public com.jayen.Variant getVariant(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
