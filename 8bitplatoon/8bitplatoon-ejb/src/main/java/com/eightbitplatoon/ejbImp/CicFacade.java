package com.eightbitplatoon.ejbImp;

import com.eightbitplatoon.ejb.CicFacadeRemote;
import com.eightbitplatoon.entity.Cic;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CicFacade implements CicFacadeRemote {

    @PersistenceContext(unitName = "eightbitplatoon")
    private EntityManager em;

    @Override
    public Cic find(Long id) {
        return em.find(Cic.class, id);
    }

}
