package com.anudip;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Course c=new Course();
    	c.setCid(101);
    	c.setCoursename("java programming");
    	Course c1=new Course();
    	c1.setCid(102);
    	c1.setCoursename("angular programming");
    	
    	Teacher tea=new Teacher();
    	tea.setId(101);
    	tea.setName("Mrunali");
    	tea.getList1().add(c);
    	tea.getList1().add(c1);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class).addAnnotatedClass(Course.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	s.save(c);
    	s.save(c1);
    	s.save(tea);
    	s.getTransaction().commit();
        System.out.println( "Hello World!" );
    }
}


