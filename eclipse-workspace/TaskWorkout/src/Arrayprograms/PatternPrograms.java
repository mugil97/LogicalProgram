package Arrayprograms;

public class PatternPrograms {

		public static void main(String[] args) {
				
			PatternPrograms pps = new PatternPrograms();
//			pps.pattern1();
			pps.pattern2();
//			pps.pattern3();
//		    pps.pattern4();
//			pps.pattern5();
//			pps.pattern6();
		}

		private void pattern6() {
			// TODO Auto-generated method stub
			for(int line = 1;line<=5;line++)
			{
				int no = 1;
				while(no<=line)
				{
					System.out.print("*"+ " ");
					no++;
				}
				System.out.println();
			}
			for(int line = 5;line>=1;line--)
			{
				int no = 1;
				while(no<=line)
				{
					System.out.print("*"+ " ");
					no++;
				}
				System.out.println();
			}
		}

		private void pattern2() {
			
			for(int no=1; no<=25; no++)
		    {
		    System.out.print(no+" ");
		    if(no%5==0)
		    {
		      System.out.println();
		    }
		    }
		}

		private void pattern1(){
			
			 for(int count = 1; count<=3;count++)
			    {
			        for(int no = 1; no<=5; no++)
			        {
			        System.out.print(no+" "); 
			        }
			        System.out.println(); 
			    }

				 }
		 public void pattern3() {
				  for(int count = 5;count>=1;count--)
				  {
				      for(int no=1; no<=count; no++) {
				      System.out.print(no+" "); 
				      
				      }
				      System.out.println(); 
				  
				  }
				 }
			public void pattern4() {
				  for(int count = 1;count<=5;count++)
				  {
				      for(int no=6; no>count; no--) {
				      System.out.print(no-count+" "); 
				      }
				      System.out.println(); 
				  }
				 }
			public void pattern5() {
				  for(int count = 5;count>=1;count--) {
				   for(int i = 1;i<count;i++) {
				    System.out.print(i+" ");
				   }
				   System.out.println();
				  }
				 }
		}

