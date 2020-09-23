package com.sept.registrationproject;
import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("~ Welcome to the Sign-Up CLI ~");
		System.out.println("In order to sign-up, please enter required information.");
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 'q' to Exit the program.");
		
		System.out.print("Enter a First Name: ");
		while(user.getFirstName() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setFirstName(temp);
		}
		
		System.out.print("Enter a Last Name: ");
		while(user.getLastName() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setLastName(temp);
		}
		
		System.out.print("Enter a email: ");
		while(user.getEmail() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setEmail(temp);
		}
		
		System.out.println("Enter a password: ");
		System.out.println("Length has to be longer than 8 & Shorter than 20");
		System.out.println("At least one lowercase, uppercase, number, special character among @#$%");
		while(user.getPassword() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setPassword(temp);
		}
		
		System.out.println("Enter a date of birth: ");
		System.out.println("Format: mm/dd/yyyy");
		while(user.getDateOfBirth() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setDateOfBirth(temp);
		}
		
		System.out.println("Enter a gender: ");
		System.out.println("ex) m, male, female, f");
		while(user.getGender() == null) {
			String temp = input.nextLine();
			if(temp.equals("q")) {
				System.out.println("Successfully Logged out from the program.");
				return;
			}
			user.setGender(temp);
		}
		System.out.println("====================================================================================");
		System.out.println("Successfully Signed-up with following information:");
		System.out.println("First Name - " + user.getFirstName());
		System.out.println("Last Name - " + user.getLastName());
		System.out.println("Email - " + user.getEmail());
		System.out.println("Password - " + user.getPassword());
		System.out.println("Date of Birth - " + user.getDateOfBirth());
		System.out.println("Gender - " + user.getGender());
	}

}
