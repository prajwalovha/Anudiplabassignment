package com.example;

import java.util.ArrayList;
import java.util.List;

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
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
   	  Configuration con1=new Configuration().configure().addAnnotatedClass(Courses.class);
   	  SessionFactory sf= con.buildSessionFactory();
   	  Session ss= sf.openSession();
   	  Transaction T= ss.beginTransaction();
   
   	Teacher T1 =new Teacher();
   	T1.setT_id(1);
   	T1.setT_name("Mrunali");
   	
   	Courses C1 = new Courses();
   	Courses C2 = new Courses();
   	Courses C3 = new Courses();
   	C1.setC_id(1001);
   	C2.setC_id(1002);
   	C3.setC_id(1003);
   	C1.setC_name("Java programming");
   	C2.setC_name("Python programming");
   	C3.setC_name("Angular programming");
   	
   	List<Courses> Cos= new ArrayList<Courses>();
   	Cos.add(C1);
   	Cos.add(C2);
   	Cos.add(C3);
   	
   	T1.setCourses(Cos);
   	
   	
   	ss.save(T1);
	  T.commit();
   	  
   	  
        System.out.println( "Hello World!" );
    }
}
