
package fr.m2i.jpa.hibernate.dao;

import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import fr.m2i.jpa.hibernate.model.Adresse;
import fr.m2i.jpa.hibernate.model.Utilisateur;
import java.util.List;
import javax.persistence.*;


public class AdresseDAO {
    
    EntityManager em = getEntityManager() ;
    
    
    public List<Adresse> findByUtilisateur(Utilisateur user){    
        
        Query findByUtilisateurQuery =   em.createQuery("SELECT a FROM Adresse a WHERE a.utilisateur = ?1");   
        findByUtilisateurQuery.setParameter(1,user);
        return findByUtilisateurQuery.getResultList();
        
    }
    
     public List<Adresse> findAll(){
        
        Query findAllQuery =   em.createQuery("SELECT a FROM Adresse a");       
        return findAllQuery.getResultList();        
        
    }      
            
    
    public Adresse findById(Long id){
        return em.find(Adresse.class, id);
        
    }
    
     public void create(Adresse adresse){
        EntityTransaction transact = null ;
        
         try{
            
            transact = em.getTransaction();
            transact.begin();
            em.persist(adresse);
            transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                System.out.println("Une erreur s'est produite durant la création !");
                transact.rollback();
            }
            
        }
        
    }
     
     public void update(Adresse adresseData){
         
             EntityTransaction transact = null ;
         
              Adresse adresseToUpdate = findById(adresseData.getId());
              
              if(adresseData != null) {
                  adresseToUpdate.copy(adresseData);
              }
              
              try{
            
                       transact = em.getTransaction();
                       transact.begin();
                      em.merge(adresseToUpdate);
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

        Adresse adresseToDelete = findById(id);

        if (adresseToDelete != null) {
            try {
                transact = em.getTransaction();
                transact.begin();
                em.remove(adresseToDelete);
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
