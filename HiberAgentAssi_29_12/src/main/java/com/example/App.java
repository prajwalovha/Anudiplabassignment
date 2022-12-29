package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext ap = new ClassPathXmlApplicationContext("confi.xml");
         AgentDao Dao=(AgentDao)ap.getBean("e");
         
         
     //  save method   
     //  System.out.println(Dao.saveAgent(new Agent(1,"Rebeeca",1))); 
          
     //  System.out.println(Dao.saveAgent(new Agent(2,"Ilsa",1))); 
          
     //  System.out.println(Dao.saveAgent(new Agent(3,"Ethan",1))); 
         
          
     //  update method  
     //  System.out.println(Dao.updateAgent(new Agent(1,"lenn",1)));
         
     //  delete method 
     //  System.out.println(Dao.deleteAgent(new Agent(1)));// delete method call
          
         
          
        System.out.println( "Hello World!" );
    }
}
