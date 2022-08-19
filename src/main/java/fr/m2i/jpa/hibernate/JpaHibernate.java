package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.AdresseDAO;
import fr.m2i.jpa.hibernate.dao.ProduitDAO;
import fr.m2i.jpa.hibernate.dao.RoleDAO;
import fr.m2i.jpa.hibernate.dao.UtilisateurDAO;
import fr.m2i.jpa.hibernate.model.Adresse;
import fr.m2i.jpa.hibernate.model.Produit;
import fr.m2i.jpa.hibernate.model.Role;
import fr.m2i.jpa.hibernate.model.Utilisateur;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

public class JpaHibernate {

    public static void main(String[] args) {    
        
        
//        //  *****************ROLE*****************
//        Role premierRole = new Role("Acheteur", "CUSTOMER");
//        Role secondRole = new Role("Invité", "GUEST");
//        RoleDAO roleDao = new RoleDAO();
//        roleDao.create(premierRole);
//        roleDao.create(secondRole);
//        List<Role> listRole = roleDao.findAll();
//        
//        for (Role role : listRole) {
//            System.out.println(role);
//        }
//        premierRole.setDescription("Administrateur");
//        premierRole.setIdentifiant("ADMIN");
//        roleDao.update(premierRole);


//***********Utilisateur********************
//        RoleDAO roleDao = new RoleDAO();
//        Role roleUser = roleDao.findById(1L);
//        Role roleUser2 = roleDao.findById(2L);
//        Role roleUser3 = roleDao.findById(3L);
//
//        Date dateNaissance = new Date();
//        Date dateNaissanceUpdate = new Date();
//
//        try {
//
//            dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse("27/09/1995");
//
//        } catch (Exception e) {
//            System.out.println("Erreur lors de la création de la date");
//        }
//
//        try {
//
//            dateNaissanceUpdate = new SimpleDateFormat("dd/MM/yyyy").parse("27/09/2021");
//
//        } catch (Exception e) {
//            System.out.println("Erreur lors de la création de la date");
//        }
//
//        Date dateCreation = new Date();
//        Date dateModification = new Date();
//
//        Utilisateur firstUser = new Utilisateur(true, "Monsieur", dateCreation, dateModification, dateNaissance, "Topinambourg", false, "password", "Obama", "Barack", roleUser2);
//        Utilisateur secondUser = new Utilisateur(true, "Monsieur", dateCreation, dateModification, dateNaissance, "Salsifi", false, "zheelfper", "Gojo", "Satoru", roleUser);
//        Utilisateur thirdUser = new Utilisateur(true, "Monsieur", dateCreation, dateModification, dateNaissance, "Geronimo", false, "schdzafjoe", "Berserk", "Guts", roleUser3);
//        Utilisateur fourthUser = new Utilisateur(true, "Monsieur", dateCreation, dateModification, dateNaissance, "Encontras", false, "chsbipepez", "Bellavia", "Giulia", roleUser2);
//
//        UtilisateurDAO userDao = new UtilisateurDAO();
//
//        userDao.create(firstUser);
//        userDao.create(secondUser);
//        userDao.create(thirdUser);
//        userDao.create(fourthUser);
//        fourthUser.setDateNaissance(dateNaissanceUpdate);
//        fourthUser.setId(5L);
//        userDao.update(fourthUser);
//        thirdUser.setId(4L);
//        userDao.delete(thirdUser.getId());


//********************Adresse****************************
//// Instanciation des DAO
//  RoleDAO roleDao = new RoleDAO();
//  UtilisateurDAO userDao = new UtilisateurDAO();
// AdresseDAO adressDao = new AdresseDAO();
//  
//  
//  // On recupere deux utilisateurs
//  Utilisateur user = userDao.findById(1L) ;
//  Utilisateur user2 = userDao.findById(3L) ;
//  
// 
//  // On crée nos adresse dans la JVM
//  Adresse newAdresse = new Adresse("18100","France",true,"Vierzon","12 rue Edouard Vaillant",user);
//  Adresse deuxiemeAdresse = new Adresse("31500","France",false,"Toulouse","45 boulevard de la gare",user);  
//  Adresse troixAdresse = new Adresse("75015","France",true,"Paris","25 rue de la Paix",user2);
// 
//  
//  // On envoie tout en creation en BDD
//  adressDao.create(newAdresse);
//  adressDao.create(deuxiemeAdresse);
//  adressDao.create(troixAdresse);
//  
//  // creation d'une adrresse de "Transport" en JVM contenant les données a modifier
//  
//  Adresse adressToUpdate = new Adresse("18100","France",false,"Vierzon","12 rue Edouard Vaillant",user);
//  adressToUpdate.setId(1L);
//  
//  // On commit les changements en BDD
//  adressDao.update(adressToUpdate);
//  
//  
//  // TESTS :
//  
//  // Find by ID
//  
//  Adresse adressePrincipale = adressDao.findById(1L);
//  
//  System.out.println(adressePrincipale);
//  
//  // Find by Utilisateur
//  List<Adresse> listAdressUser = adressDao.findByUtilisateur(user);
//  
//  for(Adresse adresse : listAdressUser){
//     System.out.println(adresse); 
//  }
//  
//  
//  // Find ALL
//  
//   List<Adresse> listAdress = adressDao.findAll();
//  
//  for(Adresse adresse : listAdress){
//     System.out.println(adresse); 
//  }
//  
  
    
//  adressDao.delete(3L);
//  adressDao.delete(4L);


/////*******************PRODUIT********************************

//  //Instanciation du DAO
  ProduitDAO produitDao = new ProduitDAO();
//  
//  // Creation
//  Produit produit = new Produit(true,"une petite pomme","Pomme",2.5F,"AZEPOM",10);
//  Produit produitToUpdate = new Produit(true,"Poire de saison","Poire",2.5F,"AZEPOI",10);
//  
//  // Create
//  
//  produitDao.create(produit);
//  
//  
//  // Update
//   
//   produitToUpdate.setId(1L);
//   
//   produitDao.update(produitToUpdate);
//   
//   
//   // Find ALL
//   
//   produitDao.create(produit);   
//   List<Produit> inventaire = produitDao.findAll();
//   
//   for(Produit p : inventaire){
//       System.out.println(p);
//   }
//   
//   // Find by id 
//  
//  Produit founded = produitDao.findById(1L);
//  System.out.println(founded);
  
String name = "eget, dictum placerat, augue. Sed molestie. Sed id risus quis";
String description = "Poire de saison" ;
String reference = "bibendum";


List<Produit> resultList = produitDao.findByNom(name);

displayResult(resultList);

resultList = produitDao.findByDescription(description);

displayResult(resultList);


resultList = produitDao.findByPrix(36.00);

displayResult(resultList);


resultList = produitDao.findByReference(reference);
displayResult(resultList);



Produit founded = produitDao.findByMostQuantity();

System.out.println(founded);

   


    }
    
    public static void displayResult(List<Produit> list){
        for(Produit p : list){
            System.out.println("**************");
            System.out.println("Id Produit : " + p.getId());
            System.out.println("Nom Produit : " + p.getNom());
            System.out.println("Prix Produit : " + p.getPrix());
            System.out.println("Quantite Produit : " + p.getStock());
            System.out.println("Rference Produit : " + p.getReference());            
            System.out.println("Description Produit : " + p.getDescription());
            System.out.println("**************");
            
           
      }
        
        
    }  
    
}
