package com.vg.testng;

/**
 * This class prints the given messages on console
 *
 */
public class MessageUtil {

	private String message;

	public MessageUtil(String message) {
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
