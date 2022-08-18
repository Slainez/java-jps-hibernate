
package fr.m2i.jpa.hibernate.dao;

import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import fr.m2i.jpa.hibernate.model.Utilisateur;
import java.util.List;
import javax.persistence.*;


public class UtilisateurDAO {
    EntityManager em = getEntityManager() ;
            
      public List<Utilisateur> findAll(){
        
        Query findAllQuery =   em.createQuery("SELECT u FROM Utilisateur u");       
        return findAllQuery.getResultList();        
        
    }      
            
    
    public Utilisateur findById(Long id){
        return em.find(Utilisateur.class, id);
        
    }
    
    public void create(Utilisateur user){
        EntityTransaction transact = null ;
        
         try{
            
            transact = em.getTransaction();
            transact.begin();
            em.persist(user);
            transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                System.out.println("Une erreur s'est produite durant la création !");
                transact.rollback();
            }
            
        }
        
    }
    
     public void update(Utilisateur userData){
         
             EntityTransaction transact = null ;
         
              Utilisateur userToUpdate = findById(userData.getId());
              
              if(userData != null) {
                  userToUpdate.copy(userData);
              }
              
              try{
            
                       transact = em.getTransaction();
                       transact.begin();
                      em.merge(userToUpdate);
                      transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                System.out.println("Une erreur s'est produite durant la modification!");
                transact.rollback();
            }
            
        }
        
    }
     
      public void delete(Long id){
          
        EntityTransaction transact = null;

        Utilisateur userToDelete = findById(id);

        if (userToDelete != null) {
            try {
                transact = em.getTransaction();
                transact.begin();
                em.remove(userToDelete);
                transact.commit();

            } catch (Exception e) {
                if (transact != null) {
                    System.out.println("Une erreur s'est produite durant la suppression!");
                    transact.rollback();
                }

            }

        }

    }       
          
          
        
    
    
}
