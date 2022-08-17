package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.RoleDAO;
import fr.m2i.jpa.hibernate.model.Role;
import java.util.List;

public class JpaHibernate {

    public static void main(String[] args) {    
        
        
        
        Role premierRole = new Role("Acheteur","CUSTOMER");
        Role secondRole = new Role("Invité","GUEST");
        
        RoleDAO roleDao = new RoleDAO();
        roleDao.create(premierRole);
        roleDao.create(secondRole);
        
        
        List<Role> listRole = roleDao.findAll();
        
        for( Role role : listRole){
            
            System.out.println(role);
        }
        
       
        
        //premierRole.setDescription("Administrateur") ;
       // premierRole.setIdentifiant("ADMIN");       
       // roleDao.update(premierRole);
        
    }
}
