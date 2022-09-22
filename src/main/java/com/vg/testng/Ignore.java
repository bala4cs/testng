package com.vg.testng;

/**
 * This class prints the given messages on console
 *
 */
public class Ignore {

	private String message;

	public Ignore(String message) {
		this.message = message;
	}

	public String printMessage() {
		System.out.println(message);
		return message;
	}

	public String salutationMessage() {
		message = "Hi " + message;
		System.out.println(message);
		return message;
	}
}
