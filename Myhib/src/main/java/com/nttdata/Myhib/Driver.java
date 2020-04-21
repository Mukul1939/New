package com.nttdata.Myhib;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure("hib.config.xml").buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
	       Scanner sc=new Scanner(System.in);
	        int id1;
	        int w=0;
	        emp e1=new emp();
	    
	        do{
	        	System.out.println("select any one:\n");
	        	System.out.println("1.Create");
	        	System.out.println("2.update");
	        	System.out.println("3.delete");
	        	System.out.println("4.exit");
	        	 w=sc.nextInt();
	        	switch(w){
	        	case 1:
	        	{
	        		System.out.println("enter the id\n");
	        	     int n=sc.nextInt();
	        	     System.out.println("enter the name\n");
	        	     String s=sc.next();
	        	     System.out.println("enter the salary\n");
	        	     double r=sc.nextDouble();
	        	        
	        	        e1.setempId(n);
	        	        e1.setempName(s);
	        	        e1.setempSalary(r);
	        	        session.save(e1);
	        	        t.commit();
	        	        session.close();
	                   System.out.println("press any key to continue");
	                   System.out.println(w);
	        	}
	        	break;
	        	case 2:
	        	{
	        		 System.out.println("enter the id for the reference of row to be updated\n");
	        		  id1=sc.nextInt();
	        		    Object o=session.load(emp.class, new Integer(id1));
	        		  e1=(emp)o;
	        		  System.out.println("enter the amount of salary u want to update\n");
	        		  double sal=sc.nextDouble();
	        		  e1.setempSalary(sal);
	        		  session.save(e1);
	        		  t.commit();
	      	        session.close();
	                 System.out.println("press any key to continue");
	                 System.out.println(w);
	        	}
	        	break;
	        	case 3:
	        	{
	        		 System.out.println("enter the id for the reference of row to be deleted\n");
	       		  id1=sc.nextInt();
	       	    Object o=session.load(emp.class, new Integer(id1));
	       		e1=(emp)o;
	       		session.delete(e1);
	      t.commit();
		        session.close();
	           System.out.println("press any key to continue");
	           System.out.println(w);
	        	}
	        	break;
	        		
	        	}
	        	 System.out.println("press any key to continue");
	        	 w=sc.nextInt();
	        }while(w!=5);
	        
		}
	}


