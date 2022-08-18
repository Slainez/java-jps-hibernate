package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.RoleDAO;
import fr.m2i.jpa.hibernate.dao.UtilisateurDAO;
import fr.m2i.jpa.hibernate.model.Role;
import fr.m2i.jpa.hibernate.model.Utilisateur;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

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
        Role roleUser2 = roleDao.findById(2L);
         Role roleUser3 = roleDao.findById(3L);
       
       
       Date dateNaissance = new Date();
       Date dateNaissanceUpdate = new Date() ;
       
       try{
           
           
             dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse("27/09/1995");
           
           
       }catch(Exception e){
           System.out.println("Erreur lors de la création de la date");
       }
       
       try{
           
           
             dateNaissanceUpdate = new SimpleDateFormat("dd/MM/yyyy").parse("27/09/2021");
           
           
       }catch(Exception e){
           System.out.println("Erreur lors de la création de la date");
       }
      
       Date dateCreation = new Date();
       Date dateModification = new Date();
       
       Utilisateur firstUser = new Utilisateur(true, "Monsieur", dateCreation ,dateModification, dateNaissance, "Topinambourg", false, "password", "Obama", "Barack", roleUser2) ;
        Utilisateur secondUser = new Utilisateur(true, "Monsieur", dateCreation ,dateModification, dateNaissance, "Salsifi", false, "zheelfper", "Gojo", "Satoru", roleUser); 
        Utilisateur thirdUser = new Utilisateur(true, "Monsieur", dateCreation ,dateModification, dateNaissance, "Geronimo", false, "schdzafjoe", "Berserk", "Guts", roleUser3) ;
        Utilisateur fourthUser = new Utilisateur(true, "Monsieur", dateCreation ,dateModification, dateNaissance, "Encontras", false, "chsbipepez", "Bellavia", "Giulia", roleUser2) ;
       
       UtilisateurDAO userDao = new UtilisateurDAO();
       
      // userDao.create(firstUser);
      //  userDao.create(secondUser);
       //  userDao.create(thirdUser);
        // userDao.create(fourthUser);
        
       // fourthUser.setDateNaissance(dateNaissanceUpdate);
       //fourthUser.setId(5L);
        
        //userDao.update(fourthUser);
        
        thirdUser.setId(4L);
       userDao.delete(thirdUser.getId());
       
       
    }
}
