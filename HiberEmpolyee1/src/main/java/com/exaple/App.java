package com.exaple;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
	  Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
	  SessionFactory sf= con.buildSessionFactory();
	  Session ss= sf.openSession();
	  Transaction T= ss.beginTransaction();
	  Employee emp=new Employee();
	  
	  
	  Scanner sc=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR ID.");
	  int A =sc.nextInt();
	  emp.setEid(A);//to set value of id 
	  
	  
	  
	  Scanner sc1=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR NAME.");
	  String B =sc1.nextLine();
	  emp.setEname(B);//to set value of NAME  which is enter by user
	  
	  
	  
	  Scanner sc2=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR DEPARTMENT.");
	  String C =sc2.nextLine();
	  emp.setEdept(C); //to set value of dept  which is enter by user
	  
	  
	  
	  
	  Scanner sc3=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR SALARY.");
	  int D =sc3.nextInt();
	  emp.setEsalary(D);
	  
	  
	  Address ad=new Address();//CREATING OBJ OF Address CLASS 
	  
	  
	  Scanner sc4=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR AREA.");
	  String E =sc4.nextLine();
	  ad.setArea(E);//to set value of AREA  which is enter by user
	  
	  
	  
	  Scanner sc5=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR CITY.");
	  String F =sc5.nextLine();
	  ad.setCity(C);//to set value of CITY  which is enter by user
	  
	  
	  Scanner sc6=new Scanner(System.in);//to get input from scanner
	  System.out.println("ENTER YOUR PINCODE.");
	  int G =sc6.nextInt();
	  ad.setPincode(G);//to set value of CITY  which is enter by user
	  emp.setAddress(ad);
	  
	  
	  ss.save(emp);
	  T.commit();
	  
	 /* Address ad2=new Address();
  	ad2.setCity("pune");
  	ad2.setPincode(410001);
  	s4.setAddress(ad2);*/
	  
	  
	
			  System.out.println("THANK YOU!!!!");
			  
  }
}




