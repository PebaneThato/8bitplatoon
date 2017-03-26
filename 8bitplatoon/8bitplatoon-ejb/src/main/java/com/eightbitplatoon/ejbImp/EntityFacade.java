package com.eightbitplatoon.ejbImp;

import com.eightbitplatoon.ejb.EntityFacadeRemote;
import com.eightbitplatoon.entity.Entity;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
        Logger.getLogger(EntityFacade.class.getName()).log(Level.SEVERE, "communication : " + communication, communication);
        em.persist(communication);
        Logger.getLogger(EntityFacade.class.getName()).log(Level.SEVERE, "DONE SAVING : " + communication, communication);
    }

}
