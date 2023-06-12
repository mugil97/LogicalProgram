package com.java;

public class StringDemo {

	public static void main(String[] args) {

//		 String last_movie1 = "GN";
//		 String last_movie2 = "GN";
//		 String last_movie3 = "GN";
//		 String last_movie4 = "GN";
//		 System.out.println(last_movie1.hashCode());
//	     System.out.println(last_movie2.hashCode());
//	     System.out.println(last_movie3.hashCode());
//		 System.out.println(last_movie4.hashCode());
//		 last_movie1 = "2018";
//		 System.out.println(last_movie1.hashCode());
//		 System.out.println(last_movie2.hashCode());
//		 System.out.println(last_movie3.hashCode());
//		 System.out.println(last_movie4.hashCode());
		 String name = "praveen";
//		  System.out.println(name.charAt(0));
//		  System.out.println(name.charAt(1));
//		  System.out.println(name.charAt(2));
//		  System.out.println(name.charAt(3));
//		  System.out.println(name.charAt(4));
//		  System.out.println(name.charAt(5));
		 System.out.println(name.length());
		  for(int i = 0;i<=name.length()-1;i++)
		  {
			  if(name.charAt(i)=='a')
			  {
			  System.out.println(name.charAt(i));
		      }
			  System.out.println(name.charAt(0));
			  System.out.println(name.charAt(name.length()/2));
			  System.out.println(name.charAt(name.length()-1));
		  }

	}

}
