package Javabasics;

public class palindrome_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome_prgm pg = new palindrome_prgm();
		pg.print_reverse(9697);
		pg.find_count_of_digit(23456);
		pg.find_sum_of_digits(87642);
		pg.reverse_a_no(1234);
		pg.palindrome(1234321);

	}

	private void palindrome(int cake) //1234
	{
		// TODO Auto-generated method stub
		int no2 = cake;
	    int reverse = 0;
	    while(cake>0)   //123>0 12>0    1>0 
	    {
	    int rem = cake%10; //1
	    reverse = (reverse * 10) + rem; //4 43  432 4321
	    cake = cake/10; //0
	     }
	     System.out.println(reverse);
	      System.out.println(cake);
	     if(reverse == no2)
	     {
	     System.out.println("palindrome");
	     }
	     else
	     {
	     System.out.println("not palindrome");
	     }
	//System.out.println("Reverse is " + reverse);
	}
		
	

	private void reverse_a_no(int cake) //1234
	{
		// TODO Auto-generated method stub
		 int reverse = 0;
		    while(cake>0)   //123>0 12>0    1>0 
		    {
		    int rem = cake%10; //1
		    reverse = (reverse * 10) + rem; //4 43  432 4321
		    cake = cake/10; //0
		     }
		System.out.println("Reverse is " + reverse);
		
	}

	private void find_sum_of_digits(int cake) 
	{
		// TODO Auto-generated method stub
		
		int sum = 0;
		while (cake>0)
		{
		System.out.println(cake%10);
		sum = sum + cake%10;
		cake = cake /10;
		}
		System.out.println("sum of digits is " + sum);
		}
	

	private void find_count_of_digit(int cake) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		while (cake>0)
		{
		System.out.println(cake%10);
		count = count + 1;
		cake = cake /10;
		}

		System.out.println("count of digits is " + count);
	}

	private void print_reverse(int cake) 
	{
		// TODO Auto-generated method stub
		while (cake>0)
		{
		System.out.println(cake%10);
		cake = cake /10;
		}
	}

}
