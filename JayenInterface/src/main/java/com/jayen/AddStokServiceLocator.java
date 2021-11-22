/**
 * AddStokServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jayen;

public class AddStokServiceLocator extends org.apache.axis.client.Service implements com.jayen.AddStokService {

    public AddStokServiceLocator() {
    }


    public AddStokServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddStokServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddStok
    private java.lang.String AddStok_address = "http://localhost:8080/JayenInterface/services/AddStok";

    public java.lang.String getAddStokAddress() {
        return AddStok_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddStokWSDDServiceName = "AddStok";

    public java.lang.String getAddStokWSDDServiceName() {
        return AddStokWSDDServiceName;
    }

    public void setAddStokWSDDServiceName(java.lang.String name) {
        AddStokWSDDServiceName = name;
    }

    public com.jayen.AddStok getAddStok() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddStok_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddStok(endpoint);
    }

    public com.jayen.AddStok getAddStok(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jayen.AddStokSoapBindingStub _stub = new com.jayen.AddStokSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddStokWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddStokEndpointAddress(java.lang.String address) {
        AddStok_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jayen.AddStok.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jayen.AddStokSoapBindingStub _stub = new com.jayen.AddStokSoapBindingStub(new java.net.URL(AddStok_address), this);
                _stub.setPortName(getAddStokWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddStok".equals(inputPortName)) {
            return getAddStok();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jayen.com", "AddStokService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jayen.com", "AddStok"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddStok".equals(portName)) {
            setAddStokEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
