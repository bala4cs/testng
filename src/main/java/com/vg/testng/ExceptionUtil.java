package com.vg.testng;

/**
 * This class prints the given messages on console
 *
 */
public class ExceptionUtil {

	private String message;

	public ExceptionUtil(String message) {
		this.message = message;
	}

	public void printMessage() {
		int a =0;
	    int b = 1/a;
	}

	public String salutationMessage() {
		message = "Hi " + message;
		System.out.println(message);
		return message;
	}
}
