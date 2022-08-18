package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.RoleDAO;
import fr.m2i.jpa.hibernate.model.Role;
import fr.m2i.jpa.hibernate.model.Utilisateur;
import java.util.List;

public class JpaHibernate {

    public static void main(String[] args) {    
        
        
        
    //    Role premierRole = new Role("Acheteur","CUSTOMER");
     //   Role secondRole = new Role("Invité","GUEST");
        
        //   RoleDAO roleDao = new RoleDAO();
      //  roleDao.create(premierRole);
      //  roleDao.create(secondRole);
        
      
      //  List<Role> listRole = roleDao.findAll();
        
      //  for( Role role : listRole){
            
      //      System.out.println(role);
     //   }
           
        
        //premierRole.setDescription("Administrateur") ;
       // premierRole.setIdentifiant("ADMIN");       
       // roleDao.update(premierRole);
        
       RoleDAO roleDao = new RoleDAO();
       Role roleUser = roleDao.findById(1L);
       
       Utilisateur firstUser = new Utilisateur(true, "Monsieur", 18/08/2022, 18/08/2022, 27/09/1995, "SlvLnz", false, "password", "Lainez", "Sullyvan", roleUser) ;
       
    }
}
