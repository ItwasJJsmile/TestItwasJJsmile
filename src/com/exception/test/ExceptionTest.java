package com.exception.test;

public class ExceptionTest {

	 public static void main(String args[]) {
	     int num1, num2;
	     try { 
//	         Try block to handle code that may cause exception
	        num1 = 0;
	        num2 = 62 / num1;
	        System.out.println("Try block message");
	        System.out.println("1111111111111111111");
	     } catch (ArithmeticException e) { 
	            // This block is to catch divide-by-zero error
	            System.out.println("Error: Don't divide a number by zero");
	       }
	     System.out.println("123123123");
	     System.out.println("I'm out of try-catch block in Java.");
	   }
}
