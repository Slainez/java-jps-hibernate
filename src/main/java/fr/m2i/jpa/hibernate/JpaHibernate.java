package fr.m2i.jpa.hibernate;


import fr.m2i.jpa.hibernate.dao.RoleDAO;
import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import fr.m2i.jpa.hibernate.model.Role;
import javax.persistence.EntityManager;


public class JpaHibernate {

    public static void main(String[] args) {
        EntityManager em = getEntityManager() ;
        
        if(em != null){
             System.out.println("em est pas null");
        }else{
            System.out.println("em est null");
        }
        
        Role premierRole = new Role("President Directeur General","PDG");
        premierRole.setId(1L);
        
        RoleDAO roleDao = new RoleDAO();
       // roleDao.create(premierRole);
       
        
        premierRole.setDescription("President directeur général");
        
       
        
        roleDao.update(premierRole);
        
    }
}
