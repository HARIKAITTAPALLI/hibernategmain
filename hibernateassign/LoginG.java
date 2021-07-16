package com.te.hibernateassign;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LoginG {
	
	static Account account;
	static Scanner sc= new Scanner(System.in);
	static EntityManagerFactory factory = null;
	static EntityManager manager = null;
	static EntityTransaction transaction=null;
	public static void loginVallidation(int id,String pass) {
		
		try {
			factory = Persistence.createEntityManagerFactory("sportsdata");
			manager = factory.createEntityManager();
						
			account= manager.find(Account.class, id);
			
			if ((account.getUser_id()==id) && (account.getPassword().equals(pass))){
				System.out.println("Login Successful");
			}else {
				System.out.println("Invalid Credential");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
		
	}
	public static void compose(int id,String pass) {
		try {
			factory = Persistence.createEntityManagerFactory("gmailDetails");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			
			account= manager.find(Account.class, id);
//			Inbox inbox=new Inbox();
//			inbox.setMessage_id(1);
//			inbox.setMessage("");
//			inbox.setAccount(acc);
//
//			Inbox inbox1 = new Inbox();
//			inbox1.setMessage_id(2);
//			inbox1.setMessage("");
//			inbox1.setAccount(acc);
//			ArrayList<Inbox> array = new ArrayList<Inbox>();
//			array.add(inbox);
//			array.add(inbox1);
//			acc.setInbox(array);
//			if ((acc.getUser_id()==id) && (acc.getPassword().equals(pass))){
//				System.out.println("Message Composed Successfully");
				manager.persist(acc);
			}else {
				System.out.println("failed");
			}
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
	}
	
public static void viewInbox(int id,String pass) {
		
		try {
			factory = Persistence.createEntityManagerFactory("sportsdata");
			manager = factory.createEntityManager();
						
			account= manager.find(Account.class, id);
			
			if ((account.getUser_id()==id) && (account.getPassword().equals(pass))){
				System.out.println(account.getInbox());
			}else {
				System.out.println("\nInvalid Credentials!!!!!!!!!!!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
		
	}


}
