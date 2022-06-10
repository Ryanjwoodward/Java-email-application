package com.ryan.emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "acerbus.com";
	
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
		this.password = randomPassword(defaultPasswordLength);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
	}
	
	public String showInfo() {
		
		return "Display Name: " + firstName + " " + lastName
				+ "\nCompany Email: " + email
				+ "\nMailbox Capacity: " + mailboxCapacity + "mb";
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
	
	/**
	 * Generates a random password of inputted length
	 * @param length	the length of the password
	 * @return			the password
	 */
	public String randomPassword(int length) {
		
		String passwordSet = "abcdefghijklmnopqrstuvwxyz123456789$%!";
		char[] password = new char[length];
		
		for(int idx = 0; idx < length; idx++) {
			
			int rand = (int)(Math.random() * passwordSet.length());
			password[idx] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	/**
	 * Basic setter for email inbox capacity
	 * @param capacity		the inbox capacity
	 */
	public void setMailboxCapacity(int capacity) {
		
		this.mailboxCapacity = capacity;
	}
	
	/**
	 * Basic setter for an Email (account user)'s alternate email
	 * @param altEmail		the alternate email
	 */
	public void setAlternateEmail(String altEmail) {
		
		this.alternateEmail = altEmail;
	}
	
	/**
	 * Basic setter for a user to change their password from the randomly generated password
	 * from the Email constructor
	 * @param password		the new password
	 */
	public void changePassword(String password) {
		
		this.password = password;
	}
	
	/**
	 * basic getter for returning an accounts inbox capacity
	 * @return	inbox capacity
	 */
	public int getMailboxCapacity() {
		
		return this.mailboxCapacity;
	}
	
	/**
	 * basic getter to retrieve alternate email for a user
	 * @return	the alternate email address
	 */
	public String getAlternateEmail() {
		
		return this.alternateEmail;
	}
	
	/**
	 * basic getter to retrieve the password of an account
	 * @return the password
	 */
	public String getPassword() {
		
		return this.password;
	}


}//Email Class

