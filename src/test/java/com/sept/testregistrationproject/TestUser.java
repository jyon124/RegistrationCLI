package com.sept.testregistrationproject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.sept.registrationproject.User;

public class TestUser {
	User user = new User();
	
	@Test
	public void testSetFirstName() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setFirstName' method from 'User' class:");
		Boolean result = user.setFirstName("Johnny");
		assertEquals(true, result);
		System.out.println("[Input] 'Johnny'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setFirstName(\"Johnny\")");
	}
	
	@Test
	public void testSetLastName() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setLastName' method from 'User' class:");
		Boolean result = user.setLastName("Depp");
		assertEquals(true, result);
		System.out.println("[Input] 'Depp'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setLastName(\"Depp\")");
	}
	
	@Test
	public void testSetEmail() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setEmail' method from 'User' class:");
		Boolean result = user.setEmail("joyful@mail.com");
		assertEquals(true, result);
		System.out.println("[Input] 'joyful@mail.com'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setEmail(\"joyful@mail.com\")");
	}
	
	@Test
	public void testSetPassword() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setPassword' method from 'User' class:");
		Boolean result = user.setPassword("Password123@");
		assertEquals(true, result);
		System.out.println("[Input] 'Password123@'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setPassword(\"Password123@\")");
	}
	
	@Test
	public void testSetDateOfBirth() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setDateOfBirth' method from 'User' class:");
		Boolean result = user.setDateOfBirth("09/22/1992");
		assertEquals(true, result);
		System.out.println("[Input] '09/22/1992'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setDateOfBirth(\"09/22/1992\")");
	}
	
	@Test
	public void testSetGender() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#Testing 'setGender' method from 'User' class:");
		Boolean result = user.setGender("Male");
		assertEquals(true, result);
		System.out.println("[Input] 'Male'");
		System.out.println("[Expected] Boolean true");
		System.out.println("[Output] " + result);
		System.out.println("[Result] PASSED: user.setGender(\"Male\")");
	}
}
