/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.wsimplementation;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.entity.Cic;
import com.eightbitplatoon.entity.Entity;
import com.eightbitplatoon.model.CicEntity;
import com.eightbitplatoon.model.CicWeb;
import com.eightbitplatoon.ws.CicRegistrationEngine;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.EJB;
import javax.jws.WebService;

@WebService(serviceName = "CicRegistrationEngine", portName = "CicPort", endpointInterface = "com.eightbitplatoon.ws.CicRegistrationEngine")
public class CicRegistrationEngineImpl implements CicRegistrationEngine {

    @EJB
    private EntityFacadeRemote communication;

    @Override
    public void RegisterCic(CicEntity cicEntity) {
        Entity entity = new Entity();
        Cic cic = new Cic();
        Set<Cic> cicComunications = new HashSet<Cic>();

        entity.setEntityname(cicEntity.getEntityname());
        entity.setEmailaddress(cicEntity.getEmailaddress());

        for (CicWeb cicWeb : cicEntity.getCicCollection()) {

            cic.setCictype(cicWeb.getCictype());
            cic.setSubject(cicWeb.getSubject());
            cic.setBody(cicWeb.getBody());
            cic.setSourcesystem(cicWeb.getSourcesystem());
            cic.setCictimestamp(cicWeb.getCictimestamp());
            cic.setEntityid(entity);
            cicComunications.add(cic);
        }

        entity.setCicCollection(cicComunications);

        communication.create(entity);
    }

    @Override
    public CicWeb RetrieveCicInfo(Long id) {
        return null;
    }

}
