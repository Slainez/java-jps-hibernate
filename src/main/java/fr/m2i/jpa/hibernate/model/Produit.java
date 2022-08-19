
package fr.m2i.jpa.hibernate.model;

import javax.persistence.*;


@Entity
@Table(name="produits")
public class Produit {   
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_produit",
                    length=20)
    private Long id;
    
    @Column(name= "active" ,columnDefinition="TINYINT(1)")
    private Boolean isActive ;
    
    @Column(columnDefinition="TEXT")
    private String description ;
    
    @Column(length=100)
    private String nom ;
    
    @Column(columnDefinition="FLOAT")
    private Double prix ;
    
    @Column(length=100)
    private String reference;
    
    @Column( length = 11)
    private Integer stock ;

    public Produit() {
    }

    public Produit(Boolean isActive, String description, String nom, double prix, String reference, int stock) {
        this.isActive = isActive;
        this.description = description;
        this.nom = nom;
        this.prix = prix;
        this.reference = reference;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", isActive=" + isActive + ", description=" + description + ", nom=" + nom + ", prix=" + prix + ", reference=" + reference + ", stock=" + stock + '}';
    }
    
    public void copy(Produit produitData){
        
        if(produitData.getIsActive() != null){
            this.setIsActive(produitData.getIsActive());
        }
        
        if(produitData.getDescription()!= null){
            this.setDescription(produitData.getDescription());
        } 
        
        if(produitData.getNom() != null){
            this.setNom(produitData.getNom());
        }
        
         if(produitData.getPrix() != null){
            this.setPrix(produitData.getPrix());
        }
         
          if(produitData.getReference() != null){
            this.setReference(produitData.getReference());
        }
          
           if(produitData.getStock() != null){
            this.setStock(produitData.getStock());
        }
    }
}
