
package fr.m2i.jpa.hibernate.dao;

import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import fr.m2i.jpa.hibernate.model.Produit;
import java.util.List;
import javax.persistence.*;


public class ProduitDAO {
    
    EntityManager em = getEntityManager() ;
    
    
    public List<Produit> findByNom(String name){
        Query findByNomQuery = em.createQuery("Select p From Produit p where p.nom = ?1");
        findByNomQuery.setParameter(1, name);
        return findByNomQuery.getResultList();
        
    }
    
    public List<Produit> findByDescription(String description){
        Query findByDescriptionQuery = em.createQuery("Select p From Produit p where p.description = ?1");
        findByDescriptionQuery.setParameter(1, description);
        return findByDescriptionQuery.getResultList();
        
    }
    public List<Produit> findByPrix(Double prix){
        Query findByPrixQuery = em.createQuery("Select p From Produit p where p.prix = ?1");
        findByPrixQuery.setParameter(1, prix);
        return findByPrixQuery.getResultList();
        
    }
    
    public List<Produit> findByReference(String reference){
        Query findByReferenceQuery = em.createQuery("Select p From Produit p where p.reference = ?1");
        findByReferenceQuery.setParameter(1, reference);
        return findByReferenceQuery.getResultList();
        
    }
    
    public Produit findByMostQuantity(){
        Query findByMostQuantityQuery = em.createQuery("Select p From Produit p where p.stock = (Select max(p.stock) from Produit p)");
        
        return (Produit) findByMostQuantityQuery.getSingleResult();
        
    }
    
    public List<Produit> findAll(){
        
        Query findAllQuery =   em.createQuery("SELECT p FROM Produit p");       
        return findAllQuery.getResultList();  
        
    }
    
    public Produit findById(Long id){
        
        return em.find(Produit.class, id);
    }
    
    public void create(Produit produit){
        
        EntityTransaction transact = null ;
        
        try{
            transact = em.getTransaction();
            transact.begin();
            em.persist(produit);
            transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                System.out.println("Erreur lors de la création d'un produit");
                transact.rollback();
            }
        }
    }
    
        public void update(Produit produitData){
        
        EntityTransaction transact = null ;
        
        Produit produitToUpdate =findById(produitData.getId());
        
        if(produitData != null){
            produitToUpdate.copy(produitData);
        }
        
        try{
            transact = em.getTransaction();
            transact.begin();
            em.merge(produitToUpdate);
            transact.commit();
            
        }catch(Exception e){
            if(transact != null){
                System.out.println("Erreur lors de la modification d'un produit");
                transact.rollback();
            }
        }
    }
     
        
        public void delete(Produit produit){
          
        EntityTransaction transact = null;

        Produit produitToDelete = findById(produit.getId());

        if (produitToDelete != null) {
            try {
                transact = em.getTransaction();
                transact.begin();
                em.remove(produitToDelete);
                transact.commit();

            } catch (Exception e) {
                if (transact != null) {
                    System.out.println("Une erreur s'est produite durant la suppression du produit !");
                    transact.rollback();
                }

            }

        }
    }  
    
    
    
}
