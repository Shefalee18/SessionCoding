/**
 * CalciService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soapbasics;

public interface CalciService extends javax.xml.rpc.Service {
    public java.lang.String getCalciAddress();

    public com.soapbasics.Calci getCalci() throws javax.xml.rpc.ServiceException;

    public com.soapbasics.Calci getCalci(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
