package com.java;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		ExceptionDemo ed = new ExceptionDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number : ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		ed.divide(no1,no2);
		ed.subtract(no1,no2);
		
	}

	private void subtract(int no1, int no2) {

		System.out.println(" sum of no is" + (no1-no2) );
	}

	private void divide(int no1, int no2) {

		try {
		      System.out.println(no1/no2);
		    }
		    catch(ArithmeticException praveen)
		    {
		      System.out.println("Check no2");
		    }
		finally
		{
			System.out.println("try catch");
			System.out.println(no1*no2);
		}
	}

}
