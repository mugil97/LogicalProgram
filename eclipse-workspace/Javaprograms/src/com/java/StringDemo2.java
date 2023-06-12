package com.java;

public class StringDemo2 {

	public static void main(String[] args) {

		StringDemo2 sd =  new StringDemo2();
//		sd.check_start();
		sd.check_ends();
//		sd.split();
		
		
	}

	private void split() {

		String s ="IPL is Ended yesterday";
		String[] ss = s.split(" ");
		for(int i = 0;i<ss.length;i++)
		{
		System.out.println(ss[i]);
		}
		String date = "30/05/2023";
	    String[] ds = date.split("/");
	    for(int i=0;i<ds.length;i++)
	    {
	    	System.out.println(ds[i]);
	    }
		}
	

	private void check_ends() {

		String name1 = "mugilan";
		String name2 = "lan";
		boolean ends = true;
		for(int i=0;i>name2.length();i--)
		{
			if(name2.charAt(i)==name1.charAt(i))
			{
				continue;
			}
			else
			{
				ends = false;
				break;
			}
		}
			if(ends==true)
			{
				System.out.println("Yes "+ name1 + " ends with " + name2);
			}
			else
			{
				System.out.println("Not ends with " + name2 );
			}
		
		}
	

		
//		int len1 = name1.length()-1; 
//		for(int len2 = name2.length()-1; len2>=0;len2--)
//		{
//		  if(name1.charAt(len1)== name2.charAt(len2))
//		  {
//		    len1--;
//		    continue; 
//		  }
//		  else
//		  {
//		    System.out.println("No, not ends with");
//		    ends = false; 
//		    break; 
//		  }
//		}  
//		if(ends == true)
//		{
//		  System.out.println("yes, ends with "+name2);
//		}
		  



	private void check_start() {

		 String name1 = "sabaribala";
		    String name2 = "sab";
		    boolean starts = true; 
		for(int i=0; i<name2.length();i++)  {  
		    if(name1.charAt(i) == name2.charAt(i))
		    {
		      continue;
		    }
		    else
		    {
		      starts = false; 
		      break; 
		    }
		  }
		  if(starts==true)
		  {
		    System.out.println("yes " + name1 + " starts with "+name2);
		  }
		  else
		  {
		    System.out.println("Not starts with "+name2);
		  }
		}
	}


