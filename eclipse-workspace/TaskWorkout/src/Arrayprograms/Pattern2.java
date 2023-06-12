
package Arrayprograms;

public class Pattern2 {

	public static void main(String[] args) {
		
		Pattern2 pt = new Pattern2();
//		pt.pattern1();
//		pt.patttern1a();
//		pt.Pattern2();
//		pt.Pattern2a();
//		pt.pattern3();
		pt.pattern4();
	}

	private void pattern4() {

			for(int rows =5; rows>=1;rows--)
			{
				for (int star = 1; star<= 5-rows;star++)
				{
					System.out.print("  ");
					
				}
				for(int col = 1;col<=rows;col++)
				{
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern3() {

		for(int row = 5; row>=1; row--)
	    {
	        for(int star =1; star<row; star++)
	        {
	        System.out.print("  ");
	        }
	        for(int no = 5; no>=row; no--)
	        {
	        System.out.print(no+" "); 
	        }  
	        System.out.println(); 
	    }
	}

	private void patttern1a() {
		
		for(int no = 5; no>=1; no--)
	    {
	        for(int star = 1; star<no; star++)
	          {   
	          System.out.print("* ");     
	          }
	        for(int num=1; num<=6-no; num++)
	          { 
	          System.out.print(1+ " ");
	          }
	         System.out.println(); 
	    }
	}

	private void pattern1() {
		
		for(int no = 5; no>=1; no--)
	    {
	        for(int star = 1; star<no; star++)
	        {   System.out.print("* ");     }
	        System.out.println(); 
	    }
       

	}

	private void Pattern2a() {
		
		for(int last = 1; last<=5; last++)
	    {
	        for(int no = 1; no<=last; no++) // 1
	        {
	        System.out.print(no+" "); 
	        }
	        System.out.println();
	    }
	}

	private void Pattern2() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
	    {
	        for(int star = 1; star<no; star++)
	        {  
	        	System.out.print("  ");     //1space
	        }
	        for (int num = 1; num<=6-no;num++)
	        {
	        System.out.print(num + " "); //3space
	        
//	        System.out.print(1 + " "); 
//	        System.out.print(1 + " "); 
//	        System.out.print(1 + " "); 
//	        System.out.print(1 + " "); 
	        }
	        System.out.println(); 
	    }
	
	
	}

}
