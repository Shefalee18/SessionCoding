package com.hibcoll;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmpRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating configuration object
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml"); // populates the data of the configuration file
				
				//creating session factory object 
				SessionFactory factory = cfg.buildSessionFactory();
				
				//creating session object
				Session session = factory.openSession();
				
				//creating transaction object
				Transaction t = session.beginTransaction();
				Set<Contact> phnums = new HashSet<Contact>();
				phnums.add(new Contact("676428"));
				phnums.add(new Contact("937463"));
				phnums.add(new Contact("428299"));
					Emp e1 = new Emp("Ankur",phnums);
					session.persist(e1);
					t.commit();
					session.close();
					System.out.println("Success");
	}

}
