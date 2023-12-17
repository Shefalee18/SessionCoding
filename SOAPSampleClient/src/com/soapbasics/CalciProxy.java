package com.soapbasics;

public class CalciProxy implements com.soapbasics.Calci {
  private String _endpoint = null;
  private com.soapbasics.Calci calci = null;
  
  public CalciProxy() {
    _initCalciProxy();
  }
  
  public CalciProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalciProxy();
  }
  
  private void _initCalciProxy() {
    try {
      calci = (new com.soapbasics.CalciServiceLocator()).getCalci();
      if (calci != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calci)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calci)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calci != null)
      ((javax.xml.rpc.Stub)calci)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soapbasics.Calci getCalci() {
    if (calci == null)
      _initCalciProxy();
    return calci;
  }
  
  public int add(int x, int y) throws java.rmi.RemoteException{
    if (calci == null)
      _initCalciProxy();
    return calci.add(x, y);
  }
  
  public int sub(int x, int y) throws java.rmi.RemoteException{
    if (calci == null)
      _initCalciProxy();
    return calci.sub(x, y);
  }
  
  
}