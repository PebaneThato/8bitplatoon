package com.eightbitplatoon.ws;

import com.eightbitplatoon.model.CicEntity;
import com.eightbitplatoon.model.CicWeb;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CicRegistrationEngine {
    
    @WebMethod
    public void RegisterCic(@WebParam CicEntity communication);
    
    @WebMethod
    public CicWeb RetrieveCicInfo(Long id);
}
