package Arrayprograms;

public class Sorting {

	public static void main(String[] args) {

		int[] ar = {10,7, 3,1};
		  
		 System.out.println("Before Swap");

	        for (int i=0;i<ar.length;i++)
	        {
	            System.out.print(ar[i]+" ");
	        }
	        System.out.println();

	        for (int j=1;j<=ar.length-1;j++)
	        {
	            for (int i=0;i<ar.length-j;i++)
	            {
	                if (ar[i]>ar[i+1])
	                {
	                    int temp= ar[i];
	                    ar[i]=ar[i+1];
	                    ar[i+1]=temp;

	                }
	            }
	        }

	        System.out.println("After Swap");
	        for (int i=0;i<ar.length;i++)
	        {
	            System.out.print(ar[i]+" ");
	        }
//		for(int i=0; i<ar.length;i++)
//		  {
//		    System.out.print(ar[i]+" ");
//		  }
//		  System.out.println();
//		  for(int i=0; i<ar.length-1;i++)
//		  {
//		    if(ar[i]>ar[i+1])
//		    {
//		      int temp = ar[i]; 
//		      ar[i] = ar[i+1]; 
//		      ar[i+1] = temp; 
//		    }
//		  }
//		  System.out.println("After First Swap");
//		  for(int i=0; i<ar.length;i++)
//		  {
//		    System.out.print(ar[i]+" ");
//		  }
//
//		  for(int i=0; i<ar.length-2;i++)
//		  {
//		    if(ar[i]>ar[i+1])
//		    {
//		      int temp = ar[i]; 
//		      ar[i] = ar[i+1]; 
//		      ar[i+1] = temp; 
//		    }
//		  }
//		  System.out.println();
//		  System.out.println("After Second Swap");
//		  for(int i=0; i<ar.length;i++)
//		  {
//		    System.out.print(ar[i]+" ");
//		  }
//		  for(int i=0; i<ar.length-3;i++)
//		  {
//		    if(ar[i]>ar[i+1])
//		    {
//		      int temp = ar[i]; 
//		      ar[i] = ar[i+1]; 
//		      ar[i+1] = temp; 
//		    }
//		    System.out.println();
//			  System.out.println("After Third Swap");
//		  }
//			  for(int i=0; i<ar.length;i++)
//			  {
//			    System.out.print(ar[i]+" ");
//			  }
		    
	}

}
