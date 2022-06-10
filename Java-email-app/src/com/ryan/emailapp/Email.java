package com.ryan.emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	/**
	 * Scanner object for user input
	 */
	Scanner scan = new Scanner(System.in);
	
	
	//************************
	//Constructors
	//************************
	
	/**
	 * Non-default constructor to create an Email Object
	 * @param firstName
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
	}


	// ***********************
	// Getters and Setters
	// ***********************

	/**
	 * Called by constructor for user to select department
	 * @return deparment string
	 */
	public String setDepartment() {
		System.out.print("Enter the department code:\n\t 1)Sales\n\t 2) Development\n\t 3) Accounting\n\t 0) None");
		int input = scan.nextInt();
		
		switch(input) {
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3: 
			return "Accounting";
		default:
			return "none";
		}
	}
	
	public String randomPassword(int length) {
		return "";
	}


}//Email Class

