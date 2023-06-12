package Task;

import java.util.Scanner;

public class Taskmay10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taskmay10 tk = new Taskmay10();
//		tk.print_reverse();
//		tk.average();
//		tk.highest_strike();
//		tk.highest_age();
//		tk.mark_10();
//		tk.greater80();
		tk.youtube();
	}

	

	private void youtube() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hello youtube");
		int youtube = sc.nextInt();
		int [] watch = new int[youtube];
		int total = 0;
		int i = 0;
		while(i<watch.length)
		{
			System.out.println(watch[i]);
			total = total + watch[i];
			i++;
		}
		System.out.println("total watching hours is " + total);
		
		
		
		
		
	}



	private void greater80() {
		// TODO Auto-generated method stub
		int [] mark = {100,87,56,65,76,90};
		int i = 0;
		while(i<mark.length)
		{
			if(mark[i]>80)
			{
				System.out.println();
				
			}
			else
			{
				System.out.println();
			}
			i++;
		}
		System.out.println("How many number is greater than " + );
	}



	private void mark_10() {
		// TODO Auto-generated method stub
		int [] mark = {100,87,56,65,76,90};
		int i = 0;
		while(i<mark.length)
		{
			if(mark[i]==100)
			{
//				System.out.println("centum is present");
			}
			else
			
			{
//				System.out.println("no centum mark is present");
			}
			i++;
		}
		System.out.println("centum present " );
	}



	private void highest_age() {
		// TODO Auto-generated method stub
		int [] age = {36, 34, 21, 41, 34, 32, 24, 32};
		String[] name = {"Rohit", "Rahane", "Jaishwal", "Dhoni", "Kholi", "Butler", "Rashid khan", "Suryakumar"};
		int  highest = age[0];
		int age_h = 0;
		int i = 0;
		while(i<age.length)
		{
			if(age[i]>highest)
			{
				highest = age[i];
				age_h = i;
				
			}
			i++;
			
		}
		System.out.println("Highest age is " + highest + " and the player name is " + name[age_h]);
		
	}



	private void highest_strike() {
		// TODO Auto-generated method stub
		int[] strike = {124, 122, 160, 204, 135, 148, 228, 186};
		String[] name = {"Rohit", "Rahane", "Jaishwal", "Dhoni", "Kholi", "Butler", "Rashid khan", "Suryakumar"};
		int highest = strike[0];
		int index_h = 0;
		int i = 0;
		
		while(i<strike.length)
		{
			if(strike[i]>highest)
			{
				highest = strike[i];
				index_h = i;
			}
			i++;
		}
		System.out.println("Highest Strike rate is " + highest + " and the player is "  + name[index_h]);
		
	}

	private void average() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Watching minutes ? ");
		int min = sc.nextInt();
		int[] watching_count = new int[min];
		int total = 0;
		int i = 0;
		while(i<watching_count.length)
		{
			System.out.println();
		}
	}

	private void print_reverse() {
		// TODO Auto-generated method stub
		int[] m = {56, 97, 100, 86, 45};
		int i = m.length+1;
		while(i>=0)
		{
			System.out.println(m[i]);
			i--;
		}
		
//		System.out.println(m[4]);
//		System.out.println(m[3]);
//		System.out.println(m[2]);
//		System.out.println(m[1]);
//		System.out.println(m[0]);
	}
	
}
