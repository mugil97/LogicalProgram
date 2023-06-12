package com.java;

public class StringDemo2_1 {
	public static void main(String[] args) {
		
		StringDemo2_1 sd = new StringDemo2_1();
		sd.check_count_of_character();
//		sd.nospace();
		
//		String name = "   amal raj";
//	    String name2 = "";
//	    boolean alphabet_came  = false;
//	    char[] ch = name.toCharArray();
//	    for(int i=0; i<ch.length;i++)
//	    {
//	      char letter = ch[i];
//	      if (letter==' '&& alphabet_came == false)
//	      {
//	        
//	      }
//	      else {
//	    	  alphabet_came = true;
//	    	  
//	      //System.out.print(ch[i]);
//	      name2 = name2 + letter; 
//	      }
//	    }
//	    System.out.println(name2);
//	    
	    
	    
//	    String name = "nee kavithaigala.mp3";
//
//	    System.out.println(name.substring(16)); 
//	    System.out.println(name.substring(0, 16));
		
	    
	    
	    
//		String name = "amalraj Vijayakumar";
//	    //AmAlRaJ
//	    //0123456
//	    //0  2 4 6 --> Index
//	    
//	    for(int i=0; i<name.length();i++)
//	    {
//	      char letter = name.charAt(i);
//	      if(letter>='a' && letter<='z')
//	      {
//	        if(i%2==0)
//	          {
//	          System.out.print((char)(letter-32));
//	          }
//	        else
//	        {
//	          System.out.print(letter);
//	        }
//	      }
//	      else
//	      {
//	        System.out.print(letter);
//	      }
//	    }

		
		
		
//		char letter = name.charAt(0);
//		System.out.println(char);
	}

	private void nospace() {

		
		
		
		
	}

	private void check_count_of_character() {

		String n = "mugilmaddy";
		
	int[] cc = new int[n.length()];
    
		  for(int j = 0; j<n.length(); j++)
		  {
		    int count = 1; 
		    char ch = n.charAt(j);
		    for(int i=j+1; i<n.length();i++)
		    {
		      if(ch == n.charAt(i))
		      {
		        cc[i] = -1; 
		        count++; 
		      }//sivasabari
		      
		    }
		    if(cc[j]!=-1) 
		    {
		      cc[j] = count;
		    }
		    
		    if(cc[j]>0) {
		    System.out.println(ch + " appears for " + cc[j] + 
		        " times");
		    }

		  }
	}
		  
}
		
		
//		 String n = "sivasabaribala";
//		
//		for (int j = 0;j<n.length();j++)
//		{
//			int count = 1; 
//		    char ch = n.charAt(j);
//		    for(int i=j+1; i<n.length();i++)
//		    {
//		      if(ch == n.charAt(i))
//		      {
//		        count++; 
//		      }
//		    }
//		    System.out.println(ch + " appears for " + count + 
//		        " times");		    
//			
//			}
//		}
//}

		
		
//		String n = "sivasabaribala";
//	    int count = 1; 
//	    char ch = n.charAt(0);
//	    for(int i=1; i<n.length();i++)
//	    {
//	      if(ch == n.charAt(i))
//	      {
//	        count++; 
//	      }
//	    }
//	    System.out.println(ch + " appears for " + count + 
//	        " times");
//	    
//	}


