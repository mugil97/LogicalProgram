package Basicsofjava;

import java.io.InputStream;
import  java.util.Scanner;

public class ScannerDemo2 {

	public ScannerDemo2(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			System.out.println("Hi");
			Scanner sd2= new Scanner (System.in);
			System.out.println("welcome to our shop");
			String name = sd2.next();
			System.out.println("what is your name? ");
			String name1 = sd2.next();
			System.out.println("Hi " + name1 + " is a nice name! ");
			String product= sd2.next();
			System.out.println("Enter product name ? ");
			String productname = sd2.next();
			System.out.println("Enter amount");
			Long amount = sd2.nextLong();
			System.out.println("product discount = " + amount / 2.00);
			System.out.println("product final price =  "  );
			
			
			
			
			
	}
}
