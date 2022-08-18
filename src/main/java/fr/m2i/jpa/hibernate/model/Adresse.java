
package fr.m2i.jpa.hibernate.model;

import javax.persistence.*;



@Entity
@Table(name="adresses")
public class Adresse {
    
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_adresse",
                 length = 20 )
    private Long id ;
    
    @Column(name="code_postal", length=100)
    private String codePostal ;
    
    @Column(name="pays", length=100)
    private String pays;
    
    @Column(name="principale" ,  columnDefinition = "TINYINT(1)")
    public Boolean principale ;

    @Column(name="rue", length=100)
    private String rue ;
    
    @Column(name="ville", length=100)
    private String ville ;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur ;

    public Adresse() {
    }

    public Adresse(String codePostal, String pays, Boolean principale, String rue, String ville, Utilisateur utilisateur) {
        this.codePostal = codePostal;
        this.pays = pays;
        this.principale = principale;
        this.rue = rue;
        this.ville = ville;
        this.utilisateur = utilisateur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Boolean getPrincipale() {
        return principale;
    }

    public void setPrincipale(Boolean principale) {
        this.principale = principale;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "Adresse{" + "id=" + id + ", codePostal=" + codePostal + ", pays=" + pays + ", principale=" + principale + ", rue=" + rue + ", ville=" + ville + ", utilisateur=" + utilisateur + '}';
    }
    
    public void copy(Adresse adresseData){
        
        
        
        if(adresseData.getCodePostal() != null){
             this.setCodePostal(adresseData.getCodePostal());
         }
    
       
        
        if(adresseData.getPays() != null){
             this.setPays(adresseData.getPays());
         }
          
        if(adresseData.getVille() != null){
             this.setVille(adresseData.getVille());
         }
        
         if(adresseData.getRue() != null){
             this.setRue(adresseData.getRue());
         }
         
          if(adresseData.getPrincipale() != null){
             this.setPrincipale(adresseData.getPrincipale());
         }
          
          
     
        
    }
    
    
    
}
