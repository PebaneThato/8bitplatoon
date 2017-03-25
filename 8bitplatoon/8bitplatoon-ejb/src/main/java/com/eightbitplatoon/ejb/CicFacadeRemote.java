/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eightbitplatoon.ejb;

import com.eightbitplatoon.entity.Cic;
import javax.ejb.Remote;

@Remote
public interface CicFacadeRemote {

    Cic find(Long id);
    
}
