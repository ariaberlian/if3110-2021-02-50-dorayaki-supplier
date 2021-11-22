/**
 * VariantSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jayen;

public class VariantSoapBindingSkeleton implements com.jayen.Variant, org.apache.axis.wsdl.Skeleton {
    private com.jayen.Variant impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jayen.com", "getVariant"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getVariant", _params, new javax.xml.namespace.QName("http://jayen.com", "getVariantResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://jayen.com", ">getVariantResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getVariant"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getVariant") == null) {
            _myOperations.put("getVariant", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getVariant")).add(_oper);
    }

    public VariantSoapBindingSkeleton() {
        this.impl = new com.jayen.VariantSoapBindingImpl();
    }

    public VariantSoapBindingSkeleton(com.jayen.Variant impl) {
        this.impl = impl;
    }
    public com.jayen.GetVariantResponse getVariant(java.lang.Object parameters) throws java.rmi.RemoteException
    {
        com.jayen.GetVariantResponse ret = impl.getVariant(parameters);
        return ret;
    }

}
