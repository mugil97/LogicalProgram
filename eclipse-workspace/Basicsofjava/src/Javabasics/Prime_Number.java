package Javabasics;



public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prime_Number pn = new Prime_Number();
		pn.find_divisors(40);
//		pn.find_count_of_divisors(100);
//		 pn.find_Prime(100);
//		pn.find_multiple(2);
	}

	private void find_multiple(int no1) {
		// TODO Auto-generated method stub
		
		int no2 = 1;
		while(no2<= 5)
		{
		System.out.println(no2 + " * 2 = "+ (no2 * no1));
		no2 = no2 + 1;
		}
	}

	private void find_Prime(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		    if(no%div == 0)
		    {
		    System.out.println(div);
		    count = count + 1; 
		    }
		    div = div +1; 
		 }
		System.out.println("No. of divisors is "+ count);
		if(count==0)
		    {
		        System.out.println("Given number is Prime Number");
		    }
		else
		    {
		        System.out.println("Given number is Not Prime Number");
		    }
	}

	private void find_count_of_divisors(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		    if(no%div == 0)
		    {
		    System.out.println("print cout of div:"+ div);
		    count = count + 1;
		    
		    }
		    div = div +1; 
		   
		 }
		System.out.println("No. of divisors is "+ count);
		
	}

	private void find_divisors(int no) {
		// TODO Auto-generated method stub
	
		int div = 2;
		while(div<40)
		{
		if (no%div == 0)
		{
		System.out.println("print div no:"+ div);
		}
		div = div +1;
		}
		
	}

}
