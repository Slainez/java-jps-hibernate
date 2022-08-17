package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.RoleDAO;
import fr.m2i.jpa.hibernate.model.Role;

public class JpaHibernate {

    public static void main(String[] args) {    
        
        
        
        Role premierRole = new Role("President Directeur General","PDG");
        premierRole.setId(1L);
        
        RoleDAO roleDao = new RoleDAO();
       // roleDao.create(premierRole);
       
        
        premierRole.setDescription("President directeur général");      
       
        
        roleDao.update(premierRole);
        
    }
}
