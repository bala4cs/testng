package com.vg.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	String message = ".com";
	Group groupUtil = new Group(message);

	@Test(groups = { "functest", "checkintest" })
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = ".com";
		Assert.assertEquals(message, groupUtil.printMessage());
	}

	@Test(groups = { "checkintest" })
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "tutorialspoint" + ".com";
		Assert.assertEquals(message, groupUtil.salutationMessage());
	}

	@Test(groups = { "functest" })
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage()");
		message = "www." + "tutorialspoint" + ".com";
		Assert.assertEquals(message, groupUtil.exitMessage());
	}
}