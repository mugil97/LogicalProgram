package Basicsofjava;



import java.io.InputStream;
import java.util.Scanner;

class ScannerDemo {
	public ScannerDemo(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Hi");
		  Scanner sc = new Scanner(System.in);
		  System.out.println("What is your name? ");
		  String name = sc.next(); 
		  System.out.println("Hi "+ name);
		  System.out.println("Enter your principal amount: ");
		  int amount = sc.nextInt(); 
		  System.out.println("Enter your Interest rate: ");
		  float interest = sc.nextFloat(); 
		  System.out.println("Enter no. of EMIs: ");
		  int months = sc.nextInt();
		  System.out.println("Are you an NRI? ");
		  boolean nri = sc.nextBoolean(); 
		  System.out.println("Amount is "+ amount);
		  System.out.println("Interest is "+ interest);
		  System.out.println("Month is "+ months);
		  System.out.println("NRI: "+ nri);
		  
		  
	}

}
