package com.vg.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	String message = "Manisha";
	Dependency messageUtil = new Dependency(message);

	@Test
	public void test1() {
		System.out.println("Inside testPrintMessage()");
		message = "Manisha";
		Assert.assertEquals(message, messageUtil.printMessage());
	}

	@Test(dependsOnMethods = { "test3" })
	public void test2() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi " + "Manisha";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

	@Test
	public void test3() {
		System.out.println("This is initEnvironmentTest");
	}
}