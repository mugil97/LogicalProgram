package Arrayprograms;

public class Alphapet_Pattern {

	public static void main(String[] args) {
		
		Alphapet_Pattern ap = new Alphapet_Pattern();
//		ap.pattern_star();
//		ap.pattern_c();
//		ap.pattern_e();
//		ap.pattern_f();
//		ap.pattern_8();
//		ap.pattern_b();
//		ap.pattern_d();
//		ap.pattern_o();
//		ap.pattern_u();
//		ap.patttern_h();
//		ap.pattern_l();
//		ap.pattern_s();
//		ap.pattern_t();
//		ap.pattern_i();
//		ap.pattern_a();
//		ap.pattern_x();
//		ap.pattern_v();
//		ap.pattern_p();
//		ap.pattern_j();
//		ap.pattern_W();
//		ap.pattern_q();
		ap.pattern_y();
		
	}

	private void pattern_y() {
		for(int col=1;col<=7;col++)
		{
			if(col<=4)
			{
			for(int row=1;row<=7;row++) 
			{
				if(row==col||row==8-col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		}
		for(int col=1;col<=2;col++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
		
	}

	private void pattern_q() {
		
		for(int col=1;col<=4;col++)
		{
			if(col==1)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
		}
		System.out.println();
			for (int star=1;star<=3;star++)
			{
				System.out.print("* ");
				for(int space=1;space<=3;space++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}	
			for(int col=1;col<=4;col++)
			{
				if(col==1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
			for(int row=1;row<=2;row++) {
				  for(int space=1;space<=3+row;space++)
				  {
					  System.out.print("  ");
				  }
				    System.out.println("*");
				  }
			
	}

	private void pattern_W() {

		for(int row=1;row<=4;row++)
		{
			
			
			for(int col=1;col<=8;col++)
			{
				if((col==1)||(col==8) )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println();
			
		}
		int no =4;
		int no2 = 5;
		for(int row=5;row<=8;row++)
		{
			for(int col=1;col<=8;col++)
			{
				if((col==1)||(col==8)||(col==no)||(col==no2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
			no--;
			no2++;
		}
	}

	private void pattern_j() {

		for(int col=1;col<=7;col++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		for(int star=1;star<=7;star++)
		{
			for(int space=1;space<=4;space++)
			{
				System.out.print("  ");
		}
			System.out.println("* ");
		}
		for(int col=1;col<=4;col++)
		{
			System.out.print("* ");
		}
		}
	

	private void pattern_p() {
		
		for(int col=1;col<=5;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
			for (int star=1;star<=3;star++)
			{
				System.out.print("* ");
				for(int space=1;space<=3;space++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}	
			for(int col=1;col<=5;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int row=1;row<=4;row++)
			{
				System.out.println("* ");
			}

			
		}
	

	private void pattern_v() {

		for(int col=1;col<=7;col++)
		{
			if(col<=4)
			{
			for(int row=1;row<=7;row++) 
			{
				if(row==col||row==8-col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		}
	}

	private void pattern_x() {

		for(int col=1;col<=7;col++)
		{
			if(col<=7)
			{
			for(int row=1;row<=7;row++) 
			{
				if(row==col||row==8-col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		}
	}

	private void pattern_a() {


		 for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=8; col++)
     {
     
         System.out.print("* "); 
     }
   System.out.println();
     for(int star=1; star<=7; star++)
     {
     System.out.print("* "); 
     for(int space=1; space<=6;space++)
       {
       System.out.print("  ");
       }
     System.out.println("*"); 
     }
    
	  
			
	}

	private void pattern_i() {
		
		for(int col = 1;col<=5;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for (int space =1;space<=4;space++)
		{
		for (int star= 1;star<=4;star++)
		{
			System.out.print(" ");

		}
		System.out.println("*");
		}
		for(int col = 1;col<=5;col++)
		{
			System.out.print("* ");
		}
	}

	private void pattern_t() {

		for(int col = 1;col<=5;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		for (int space =1;space<=5;space++)
		{
		for (int star= 1;star<=4;star++)
		{
			System.out.print(" ");

		}
		System.out.println("*");
		}
	}

	private void pattern_s() {

		for(int col=1;col<=4;col++)
		{
			System.out.print("* ");
		}
		for (int star = 1;star<=4;star++)
		{
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	    

		for(int last = 1;last<=3;last++)
		{
			for(int space= 1;space<=8;space++)
			{
				System.out.print(" ");
			} 
			System.out.println("*");
		}
		for(int col=1;col<=5;col++)
		{
			System.out.print("* ");
		}
}
		
	private void pattern_l() {

			
				for (int print = 1; print<=7;print++)
				{
					System.out.println("* ");
				}
				for (int col = 1;col<=7;col++)
				{
					System.out.print("* ");
				}
			
	}

	private void patttern_h() {

		for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=8; col++)
{

		  
	          System.out.print("* "); 
	      }

		for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  }
			
	

	private void pattern_u() {

		
		System.out.println(" ");
		System.out.println(" ");
		for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
  {
  
		  if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  }
	


	private void pattern_o() {

		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
    {
    
		  if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  }
   
	

	private void pattern_d() {

		for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
	    System.out.println();
	      for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	      for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
	}

	private void pattern_b() {

		for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
	    System.out.println();
	      for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	      for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
	    System.out.println();
	      for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	      for(int col=1; col<=7; col++)
	      {
	      
	          System.out.print("* "); 
	      }
	      
	}

	private void pattern_8() {
		

		 for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.print("* "); 
	      for(int space=1; space<=6;space++)
	        {
	        System.out.print("  ");
	        }
	      System.out.println("*"); 
	      }
	  for(int col=1; col<=7; col++)
      {
      
          System.out.print("* "); 
      }
    System.out.println();
      for(int star=1; star<=7; star++)
      {
      System.out.print("* "); 
      for(int space=1; space<=6;space++)
        {
        System.out.print("  ");
        }
      System.out.println("*"); 
      }
      for(int col=1; col<=7; col++)
      	{
    	  if(col==1)
    		  System.out.print("  "); 
    	  else
    		  System.out.print("* "); 
  }
	  
	}

	private void pattern_f() {

		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  System.out.println();
	  for(int star=1; star<=7; star++)
    {
    System.out.println("* "); 
    }
	}

	private void pattern_e() {

		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  System.out.println();
	  for(int star=1; star<=7; star++)
      {
      System.out.println("* "); 
      }
  for(int col=1; col<=7; col++)
      {
       if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
  System.out.println();
	  
	}

	private void pattern_c() {
		for(int col=1; col<=7; col++)
	      {
	      if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	    System.out.println();
	  for(int star=1; star<=7; star++)
	      {
	      System.out.println("* "); 
	      }
	  for(int col=1; col<=7; col++)
	      {
	       if(col==1)
	          System.out.print("  "); 
	      else
	          System.out.print("* "); 
	      }
	  System.out.println();
	  
	  
	  
	  
	}

			
			
	

	private void pattern_star() {

		for(int outside = 1;outside<=7;outside++)
		{
	     for(int inside = 1; inside<=7;inside++ )
	     {

			System.out.print("* ");
			
	     }
	     System.out.println();
	     
		}
	}

}
