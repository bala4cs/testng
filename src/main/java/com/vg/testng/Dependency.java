package com.vg.testng;

import org.testng.annotations.Test;

/**
 * This class prints the given messages on console
 *
 */
public class Dependency {

	private String message;

	public Dependency(String message) {
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

	@Test
	public void test() {
		System.out.println("Wait");
	}
}
