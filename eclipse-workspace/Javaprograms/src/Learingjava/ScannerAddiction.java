package Learingjava;

import java.util.Scanner;

import java.io.InputStream;

class ScannerAddiction {
	public ScannerAddiction(InputStream in) {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi What is your name");
		String name = sc.next();
		System.out.println("hi " + name);
		System.out.println("enter two number - First number");
		int number = sc.nextInt();
		System.out.println("Next number");
		int number2 = sc.nextInt();
		
		
	}

}
