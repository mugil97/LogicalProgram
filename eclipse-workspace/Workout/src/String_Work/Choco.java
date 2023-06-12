package String_Work;

public class Choco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="motherinlaw";
		String s2="womanhitler";
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						s2=s2.replaceFirst(""+s1.charAt(i), "");
						break;
					}
				}
			}
			
			if(s2.length()==0) {
				System.out.println("given word is an anagram");
			}else {
				System.out.println("Given word is not an anagram");
			}

		}else {
			System.out.println("Invalid input");
		}
		
	}

}
