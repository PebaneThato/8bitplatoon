/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.web;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.entity.Cic;
import com.eightbitplatoon.entity.Entity;
import com.eightbitplatoon.model.CicEntity;
import com.eightbitplatoon.model.CicWeb;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

/**
 *
 * @author pc
 */
public class CreateCICImpl implements CreateCIC {

    

    /**
     * *
     * Register communication in the database
     *
     * @param cicEntity
     */
    @Override
    public void RegisterCic(CicEntity cicEntity,EntityFacadeRemote communication) {
        Entity entity = new Entity();
        Cic cic = new Cic();
        Set<Cic> cicComunications = new HashSet<Cic>();

        try{
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
        }catch(Exception ex){
            Logger.getLogger(CreateCICImpl.class.getName()).log(Level.SEVERE, "Exception" + ex, ex);
        }
    }
}
