package String_Work;

public class String_Separate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

String_Separate ss = new String_Separate();
		
      	ss.alphabet();
	    ss.number();
		ss.specialletter();
		
	}

	private void specialletter() {
		// TODO Auto-generated method stub
		
					String ss = "mugilan02062001@gmail.com";
					for(int i =0 ;i<ss.length();i++)
					{
						char ch = ss.charAt(i);
						if(!(ch>='0'&&ch<='9')&&!(ch>='a'&& ch<='z'))
						{
							System.out.print(ch);
						}
					}
	}

	private void number() {
		// TODO Auto-generated method stub
		
		String ss = "mugilan02062001@gmail.com";
		for(int i = 0;i<ss.length();i++)
		{
			char ch = ss.charAt(i);
			if (ch>='0'&&ch<='9') 
			{
				System.out.print(ch);
			}
		}
	}

	private void alphabet() {
		// TODO Auto-generated method stub
		
		String s = "mugilan02062001@gmail.com";
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				System.out.print(ch);
			}
			
		}
	}

	
		
	
	}

		
		
		
		
	


