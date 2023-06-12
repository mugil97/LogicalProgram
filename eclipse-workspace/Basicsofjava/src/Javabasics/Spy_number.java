package Javabasics;

public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spy_number sp = new Spy_number();
		//sp.find_sum(8);
//		sp.find_multiple();
		sp.love();
//		sp.fcprogram();

		
	}

	private void love() {
		// TODO Auto-generated method stub
		
		int[] ar = {2,7,5,8,6};
		  //        0  1  2 3 4
		int key = 2; 
		int min = 0, max = ar.length-1;
		//min = 0    max = 4    mid = 2
		//min = 0    max = 1    mid = 0
		//min = 1   max = 1    mid = 1
		while(min<=max)
		{
		  int mid = (min+max)/2;
		  if(key==ar[mid])
		  {
		    System.out.println("Yes Present at "+ mid);
		    break;
		  }
		  else if(key>ar[mid]) //24>26
		  {
		    max = mid-1; //max = 1
		  }
		  else
		  {
		    min = mid+1; //min = 1
		  }

		}
		if(min>max)
		{
		  System.out.println("Key is not present");
		}
	}
		
		
		
	

	private void fcprogram()   //eg for 5 fac is 4*3*2*1
	{
		// TODO Auto-generated method stub
		
		int fact = 1;
		int no = 1;
		while(no<5)
		{
		fact = fact * no;
		no = no + 1;
		}
		System.out.println("factorial no is = " + fact );
		}
	

	private void find_multiple() {
		// TODO Auto-generated method stub
		
		
	}

	private void find_sum(int no) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int no2 = 1412;
		int rem = 0;
		while(no2>0)
		{
		rem = no2%10;
		sum = sum + rem ;
		no2 = no/10;
		}
		System.out.println("sum of no is = " + sum );
		}
	}


