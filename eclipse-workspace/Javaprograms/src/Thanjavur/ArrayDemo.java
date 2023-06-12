package Thanjavur;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
//		ad.learning1();
		ad.learning2();
	    
	}

	private void learning2() {
		// TODO Auto-generated method stub
		
		int[][] marks = new int[6][];
		marks[0] = new int[5];
		marks[1] = new int[6];
		marks[2] = new int[4];
		System.out.println(marks.length);
	    System.out.println(marks[0].length);
	    System.out.println(marks[1].length);
	    System.out.println(marks[2].length);
	}

	private void learning1() {
		// TODO Auto-generated method stub
		
		
		int[][] marks = new int[3][5];
	    //quarterly: 
	int exam = 0; 
	int subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 65; subject++;
	    marks[exam][subject] = 78; subject++;
	    
	    //half yearly: 
	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 92; subject++;
	    marks[exam][subject] = 99; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 95; subject++;
	    
	    //annual
	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 87; subject++;
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 95; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 93; subject++;
	    
	    
	    
	    int high = 0;int examno =-1;//initiate variable
	    for ( exam = 0; exam < 3; exam++) {
			
	    	int total = 0;
	    	for ( subject= 0; subject< 5; subject++) {
				
	    		total = total +marks[exam][subject];
//	    	System.out.println("Total is " + total);
	    	}
	    	if(total>high)
	    	{
	    		examno = exam;
	    		high = total;
	    	}
	    	}
	    System.out.println("Highest total is " + high + " in exam no " + examno);
		
	}
}
	    
//	  exam = 0; 
//	  for(subject=0; subject<5; subject++)
//	  {
//	    System.out.print(marks[exam][subject]+" ");
//	  }
//	  System.out.println();
//	  exam++;
//	  for(subject=0; subject<5; subject++)
//	  {
//	    System.out.print(marks[exam][subject]+" ");
//	  }
//	  System.out.println();
//	  exam++;
//	  for(subject=0; subject<5; subject++)
//	  {
//	    System.out.print(marks[exam][subject]+" ");
//	  }
//	  for (exam = 0;exam<3;exam++)
//	  {
//		  for(subject=0; subject<5; subject++)
//			  {
//			  if(marks[exam][subject]==100)
//			  {
//				  System.out.println(exam);
//				  System.out.println(subject);
//
//			  }
////		    System.out.print(marks[exam][subject]+" ");
//			  }
//		  System.out.println();
		  
	  
	


