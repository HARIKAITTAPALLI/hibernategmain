package com.te.hibernateassign;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
       Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to Gmail");
		System.out.println("Press 1 to login");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter your User Id:");
			int id=sc.nextInt();
			System.out.println("Enter your password:");
			String pass=sc.next();
			LoginG.loginVallidation(id,pass);
			System.out.println("1. Compose");
			System.out.println("2. View Inbox");
			int opt=sc.nextInt();
			switch (opt) {
			case 1:
				LoginG.compose(id, pass);
				break;
			case 2:
				LoginG.viewInbox(id, pass);
				break;
			default:
				break;
			}
			break;
		//case 2:Register.registerUser();
			//break;
		default:System.out.println("Invalid");
			break;
		}
	}
	}

