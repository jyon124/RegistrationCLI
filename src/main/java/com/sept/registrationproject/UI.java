package com.sept.registrationproject;
import java.util.Scanner;
import java.sql.*;

public class UI {
	
	public static void receivingInput(User user, UsersDAO userList) {
		System.out.println("# Welcome to the Sign-Up CLI #");
		System.out.println("In order to sign-up, please enter required information.");
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 'b' to be back.");
		
		System.out.print("Enter a First Name: ");
		while(user.getFirstName() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setFirstName(temp);
		}
		
		System.out.print("Enter a Last Name: ");
		while(user.getLastName() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setLastName(temp);
		}
		
		System.out.print("Enter a email: ");
		while(user.getEmail() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setEmail(temp);
		}
		
		System.out.println("Enter a password: ");
		System.out.println("Length has to be longer than 8 & Shorter than 20");
		System.out.println("At least one lowercase, uppercase, number, special character among @#$%");
		while(user.getPassword() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setPassword(temp);
		}
		
		System.out.println("Enter a date of birth: ");
		System.out.println("Format: mm/dd/yyyy");
		while(user.getDateOfBirth() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setDateOfBirth(temp);
		}
		
		System.out.println("Enter a gender: ");
		System.out.println("ex) m, male, female, f");
		while(user.getGender() == null) {
			String temp = input.nextLine();
			if(temp.equals("b")) {
				return;
			}
			user.setGender(temp);
		}
		System.out.println("====================================================================================");
		System.out.println("Successfully Created a new User with following information:");
		System.out.println("First Name - " + user.getFirstName());
		System.out.println("Last Name - " + user.getLastName());
		System.out.println("Email - " + user.getEmail());
		System.out.println("Password - " + user.getPassword());
		System.out.println("Date of Birth - " + user.getDateOfBirth());
		System.out.println("Gender - " + user.getGender());
		System.out.println("====================================================================================");
		userList.addUser(user);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		boolean wantExit = false;
		UsersDAO userList = new UsersDAO();
		
		while(wantExit == false) {
			System.out.println("Enter a number from the list:");
			System.out.println("1. Create & Add New User");
			System.out.println("2. Display List of users");
			System.out.println("3. Remove user");
			System.out.println("4. Update First Name");
			System.out.println("5. Exit");	
			int temp = input.nextInt();
			if(temp == 1) {
				User user = new User();
				receivingInput(user, userList);	
			} else if(temp == 2) {
				userList.printUsers();
			} else if(temp == 3) {
				System.out.println("Select a number that you want to remove from the list:");
				System.out.println("or enter '0' to be back");
				userList.printUsers();
				int choice = input.nextInt();
				if(choice == 0) ;
				else userList.removeUser(choice);
			} else if (temp == 4) {
				System.out.println("Select a number that you want to update first name from the user list:");
				System.out.println("or enter '0' to be back");
				userList.printUsers();
				int ch = input.nextInt();
				if(ch == 0) {
					
				} else {
					userList.updateUser(ch);
				}
			} else if(temp == 5) {
				System.out.println("Successfully Logged out from the program.");
				wantExit = true;
			} else {
				System.out.println("Please enter a valid number from the list.");
			}
		}
	}
}
