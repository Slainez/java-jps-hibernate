package fr.m2i.jpa.hibernate;


import static fr.m2i.jpa.hibernate.helper.SessionHelper.getEntityManager;
import javax.persistence.EntityManager;


public class JpaHibernate {

    public static void main(String[] args) {
        EntityManager em = getEntityManager() ;
        if(em != null){
             System.out.println("em est pas null");
        }else{
            System.out.println("em est null");
        }
        
    }
}
