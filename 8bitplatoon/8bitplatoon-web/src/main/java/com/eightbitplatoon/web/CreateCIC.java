/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.web;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.model.CicEntity;

/**
 *
 * @author pc
 */
public interface CreateCIC {
    /***
     * Register communication in the database
     * @param cicEntity 
     * @param communication 
     */
    public void RegisterCic(CicEntity cicEntity, EntityFacadeRemote communication);
}
