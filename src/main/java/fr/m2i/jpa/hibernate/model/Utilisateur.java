
package fr.m2i.jpa.hibernate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name="utilisateurs")
public class Utilisateur {
    
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_user",
                 length = 20 )
    private Long id ;
     
     @Column(columnDefinition="TINYINT(1)")
    private Boolean actif ;
     
     @Column( length = 100)
    private String civilite ;
     
     
     @Column(name="date_creation", columnDefinition="TIMESTAMP")
     @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation ;
     
     @Column(name="date_modification" , columnDefinition="TIMESTAMP")
     @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification ;
     
     @Column(name="date_naissance" , columnDefinition="TIMESTAMP")
     @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaissance ;
     
    @Column( length = 100) 
    private String identifiant ;
    
    @Column(name = "marquer_effacer",
                columnDefinition="TINYINT(1)")
    private Boolean marquerEffacer ;
    
    @Column( name= "mot_passe" , length = 100)
    private String password ;
    
    @Column( length = 100)
    private String nom ;
    
    @Column( length = 100)
    private String prenom ;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_role")
    private Role role ;
    
    
    @OneToMany(mappedBy = "utilisateur" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Adresse> adresses ;

   
    public Utilisateur() {
    }

    public Utilisateur( Boolean actif, String civilite, Date dateCreation, Date dateModification, Date dateNaissance, String identifiant, Boolean marquerEffacer, String password, String nom, String prenom,Role role) {
        
        this.actif = actif;
        this.civilite = civilite;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.dateNaissance = dateNaissance;
        this.identifiant = identifiant;
        this.marquerEffacer = marquerEffacer;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Boolean getMarquerEffacer() {
        return marquerEffacer;
    }

    public void setMarquerEffacer(Boolean marquerEffacer) {
        this.marquerEffacer = marquerEffacer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
     public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    
    public void copy(Utilisateur userData){
        
        this.setActif(userData.getActif());
        
        if(userData.getCivilite() != null){
             this.setCivilite(userData.getCivilite());
         }
    
        if(userData.getDateCreation()  != null){
             this.setDateCreation(userData.getDateCreation());
         }
        
        if(userData.getDateModification()  != null){
             this.setDateModification(userData.getDateModification());
         }
        
        if(userData.getDateNaissance()  != null){
             this.setDateNaissance(userData.getDateNaissance());
         }
        if(userData.getIdentifiant() != null){
            this.setIdentifiant(userData.getIdentifiant());
        }
        
        this.setMarquerEffacer(userData.getMarquerEffacer());
        
        if(userData.getPassword() != null){
            this.setPassword(userData.getPassword());
        }
        if(userData.getNom() != null){
            this.setNom(userData.getNom());
        }
        if (userData.getPrenom() != null){
            this.setPrenom(userData.getPrenom());
        }
        if(userData.getRole() != null){
            this.setRole(userData.getRole());
        }
        
    }
    
  public void addAddress(Adresse address) {
        if (adresses == null) {
            adresses = new ArrayList<>();
        }

        adresses.add(address);
        address.setUtilisateur(this);
    }

    public void removeAddress(Adresse address) {
        address.setUtilisateur(null);

        if (adresses != null) {
            adresses.remove(address);
        }
    }
    
}
