package Basicsofjava;

import java.util.Scanner;

public class ArrayDemo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  ArrayDemo ad = new ArrayDemo();
//  ad.learn_array1();
//  ad.learn_array2();
   ad.Calculate_percentage();
  //   ad.find_highest();
  //int[] marks = {92, 78, 89, 99, 96}; 
//  ad.find_second_biggest(marks);
//  ad.find_second_smallest(marks);

 }



 private void find_second_smallest(int[] marks) {
	// TODO Auto-generated method stub
	    int small= Integer.MAX_VALUE;
		int ssmall = Integer.MAX_VALUE;
		int i = 0;
		while(i<marks.length)
		{
		if (marks[i]<small)
		{
			ssmall = small;
			small = marks[i];
		}
		else if (marks[i]<ssmall)
		{
			ssmall = marks[i];
		}i++;
		}
		System.out.println("Smallest is "+ small);
	    System.out.println("Second smallest is "+ ssmall);
	    
}



private void find_second_biggest(int[] marks) {
	// TODO Auto-generated method stub
	int big = 0;
	int sbig = 0;
	int i = 0;
	while(i<marks.length)
	{
	if (marks[i]>big)
	{
		sbig = big;
		big = marks[i];
	}
	else if (marks[i]>sbig)
	{
		sbig = marks[i];
	}i++;
	}
	System.out.println("Biggest is "+big);
    System.out.println("Second Biggest is "+sbig);
    
		
}



private void find_highest() {
	// TODO Auto-generated method stub
	int[] marks = {100,78,89,99,92};
	String[] sub = {"Tamil", "English", "Maths", "Science", "Social"};
	int highest = marks[0];
	int lowest = marks[0];
	int index_h = 0;
	int index_l = 0;
	int i = 0;
	while(i<marks.length)
	{
		if(marks[i]>highest)
		{
			highest = marks[i];
			index_h = i;
		}
		if(marks[i]<lowest)
		{
			lowest = marks[i];
			index_l = i;
		}
		i++;
	}
	
	
	System.out.println("Highest marks is " + highest + " from " + sub[index_h]);
	System.out.println("Lowest marks is " + lowest + " from " + sub[index_l]);
}

private void Calculate_percentage() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("How many subjects? ");
	int sub_count = sc.nextInt();//5
	int[] marks = new int[sub_count];
	int total = 0; 
    int i = 0; 
    while(i<marks.length)
    {
      System.out.println("Enter Mark ");
      marks[i] = sc.nextInt(); 
      total = total + marks[i];
      i++; 
    }
    System.out.println("Your total is "+ total);
    float percentage = total/sub_count;
    System.out.println(percentage);
  }
	


private void learn_array2() {
	// TODO Auto-generated method stub
	 int[] nandhini = {100,100,100,100,100,100};
	 int i = 0;
	 while(i<nandhini.length)
	 {
		 
	 }
	 {
		 System.out.println(nandhini[i]);
		 i++;
	 }
//	 System.out.println(nandhini[0]);
//	 System.out.println(nandhini[1]);
//	 System.out.println(nandhini[2]);
//	 System.out.println(nandhini[3]);
//	 System.out.println(nandhini[4]);
//	 System.out.println(nandhini[5]);
}

private void learn_array1() {
  // TODO Auto-generated method stub
  int[] marks = new int[6];
  marks[0] = 100;
  marks[1] = 90;
  marks[2] = 80;
  marks[3] = 70;
  marks[4] = 60;
  marks[5] = 50;
  	 System.out.println(marks[0]);
     System.out.println(marks[1]);
     System.out.println(marks[2]);
     System.out.println(marks[3]);
     System.out.println(marks[4]);
     System.out.println(marks[5]);
  
 }

}



