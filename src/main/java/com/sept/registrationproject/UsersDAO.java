package com.sept.registrationproject;
import java.util.ArrayList;

public class UsersDAO {
	private ArrayList<User> userList = new ArrayList<User>();
	
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
	
	public void updateUser(User user) {
		// Take a input for only name, email, password, and gender
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
