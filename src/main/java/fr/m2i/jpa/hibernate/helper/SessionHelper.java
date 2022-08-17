
package fr.m2i.jpa.hibernate.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SessionHelper {
    static EntityManager entityManager = null;
    
    public static EntityManager getEntityManager(){
        if(entityManager == null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("site_commerce_pu");
            EntityManager entityManager = emf.createEntityManager();
            return entityManager ;
            
        }
        return entityManager ;
    }
    
}
