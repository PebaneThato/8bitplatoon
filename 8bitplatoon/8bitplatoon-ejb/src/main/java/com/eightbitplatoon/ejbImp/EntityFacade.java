package com.eightbitplatoon.ejbImp;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.entity.Entity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;

/**
 *
 * @author pc
 */
@Stateless
public class EntityFacade implements EntityFacadeRemote {
    @PersistenceContext(unitName = "eightbitplatoon")
    private EntityManager em;

    
    @Override
    public void create(Entity communication) {
        em.persist(communication);
    }

}
