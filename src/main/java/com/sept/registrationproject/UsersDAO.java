package com.sept.registrationproject;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersDAO {
	private ArrayList<User> userList = new ArrayList<User>();
	Scanner input = new Scanner(System.in); 
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void removeUser(User userObj) {
		User selectedUser = null;
		for(User user : userList) {
			if(user.equals(userObj)) {
				selectedUser = user;
			}
		}
		System.out.println(selectedUser.getLastName() + " " + selectedUser.getFirstName() + " has been removed.");
		userList.remove(selectedUser);
	}
	
	public void updateUser(User userObj) {
		System.out.println("Enter a current password for selected user:");
		String currPw = input.nextLine();
		if(currPw.equals(userObj.getPassword())) {
			System.out.println("Enter a new password:");
			System.out.println("Length has to be longer than 8 & Shorter than 20");
			System.out.println("At least one lowercase, uppercase, number, special character among @#$%");
			String newPw = input.nextLine();
			userObj.setPassword(newPw);
		}
		System.out.println("Incorrect current password for " + userObj.getLastName() + " " + userObj.getFirstName());
	}
	
	public User get(int choice) {
		User foundUser = null;
		int i = 0;
		for(User user : userList) {
				if(i == choice) {
					foundUser = user;
				}
				i++;
			}
		return foundUser;
	}
	
	public void printUsers() {
		System.out.println("============================================================================");
		System.out.println("# List of Users #");
		if(userList.size() == 0)System.out.println("Currently there are no user.");
		int i = 0;
		for(User user : userList) {
			System.out.println(i+1 + ". " +user.getLastName() +" "+ user.getFirstName());
			i++;
		}
		System.out.println("============================================================================");
	}
}
