
package fr.m2i.jpa.hibernate.dao;

import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import fr.m2i.jpa.hibernate.model.Role;
import javax.persistence.*;



public class RoleDAO {
    
    EntityManager em = getEntityManager() ;
    
    public Role findById(Long id){
        Role role = em.find(Role.class, id);
        return role ;
        
    }
    
    public void create(Role role){
        EntityTransaction transact = null ;
        
        try{
            
            transact = em.getTransaction();
            transact.begin();
            em.persist(role);
            transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                transact.rollback();
            }
            
        }
        
    }
    
    public void update( Role role){
        
        EntityTransaction transact = null ;
         
        Role roleToUpdate = findById(role.getId());
        
        if(!role.getDescription().equals(roleToUpdate.getDescription())){
            roleToUpdate.setDescription(role.getDescription());
        }
         if(!role.getIdentifiant().equals(roleToUpdate.getIdentifiant())){
            roleToUpdate.setIdentifiant(role.getIdentifiant());
        }
        
        try{        
                        
            transact = em.getTransaction();
            transact.begin();
            em.merge(roleToUpdate);
            transact.commit();
            
        }catch(Exception e){
              if(transact != null){
                transact.rollback();
            }
        }
        
    }
    
}
