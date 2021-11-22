/**
 * AddStokSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jayen;

public class AddStokSoapBindingSkeleton implements com.jayen.AddStok, org.apache.axis.wsdl.Skeleton {
    private com.jayen.AddStok impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jayen.com", "AddStok"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jayen.com", "num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addStok", _params, new javax.xml.namespace.QName("http://jayen.com", "addStokReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://jayen.com", "addStok"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addStok") == null) {
            _myOperations.put("addStok", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addStok")).add(_oper);
    }

    public AddStokSoapBindingSkeleton() {
        this.impl = new com.jayen.AddStokSoapBindingImpl();
    }

    public AddStokSoapBindingSkeleton(com.jayen.AddStok impl) {
        this.impl = impl;
    }
    public java.lang.String addStok(java.lang.String addStok, int num) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.addStok(addStok, num);
        return ret;
    }

}
