package com.eightbitplatoon.ejbImp;

import com.eightbitplatoon.ejb.CicFacadeRemote;
import com.eightbitplatoon.entity.Cic;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CicFacade implements CicFacadeRemote {

    @PersistenceContext(unitName = "eightbitplatoon")
    private EntityManager em;

    @Override
    public Cic find(Long id) {
        return null;
    }

}
