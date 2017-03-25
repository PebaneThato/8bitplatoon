/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.ejb;

import com.eightbitplatoon.entity.Entity;
import javax.ejb.Remote;

@Remote
public interface EntityFacadeRemote {

    public void create(Entity communication);
    
}
