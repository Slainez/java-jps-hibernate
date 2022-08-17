package fr.m2i.jpa.hibernate.model;


import javax.persistence.*;


@Entity
@Table(name="roles")
public class Role {    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_role",
                 length = 20 )
    private Long id ;
    
    @Column(columnDefinition = "TEXT")
    private String description ;
    
    @Column(length = 50)
    private String identifiant;

    public Role() {
    }

    public Role( String description, String identifiant) {        
        this.description = description;
        this.identifiant = identifiant;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
    
     @Override
    public String toString() {
        return "Role{" + "idRole=" + id + ", identifiant=" + identifiant + ", description=" + description + '}';
    }
    
}
