package com.vg.testng;

public class Group {

	private String message;

	   // Constructor
	   // @param message to be printed
	   public Group(String message) {
	      this.message = message;
	   }

	   // prints the message
	   public String printMessage() {
	      System.out.println(message);
	      return message;
	   }

	   // add "tutorialspoint" to the message
	   public String salutationMessage() {
	      message = "tutorialspoint" + message;
	      System.out.println(message);
	      return message;
	   }

	   // add "www." to the message
	   public String exitMessage() {
	      message = "www." + message;
	      System.out.println(message);
	      return message;
	   }

}
