package com.vg.testng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
   String message = "Manisha";	
   ExceptionUtil messageUtil = new ExceptionUtil(message);
	   
   @Test(expectedExceptions = ArithmeticException.class)
   //@Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }
   
}