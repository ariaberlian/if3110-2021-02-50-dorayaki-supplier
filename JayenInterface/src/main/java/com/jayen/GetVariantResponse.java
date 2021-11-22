/**
 * GetVariantResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jayen;

public class GetVariantResponse  implements java.io.Serializable {
    private java.lang.String getVariantReturn;

    public GetVariantResponse() {
    }

    public GetVariantResponse(
           java.lang.String getVariantReturn) {
           this.getVariantReturn = getVariantReturn;
    }


    /**
     * Gets the getVariantReturn value for this GetVariantResponse.
     * 
     * @return getVariantReturn
     */
    public java.lang.String getGetVariantReturn() {
        return getVariantReturn;
    }


    /**
     * Sets the getVariantReturn value for this GetVariantResponse.
     * 
     * @param getVariantReturn
     */
    public void setGetVariantReturn(java.lang.String getVariantReturn) {
        this.getVariantReturn = getVariantReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVariantResponse)) return false;
        GetVariantResponse other = (GetVariantResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getVariantReturn==null && other.getGetVariantReturn()==null) || 
             (this.getVariantReturn!=null &&
              this.getVariantReturn.equals(other.getGetVariantReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetVariantReturn() != null) {
            _hashCode += getGetVariantReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVariantResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jayen.com", ">getVariantResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVariantReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jayen.com", "getVariantReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
