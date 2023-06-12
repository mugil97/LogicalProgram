package Arrayprograms;

public class WorkOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WorkOut wo = new WorkOut();
// wo.task1();
// wo.patternhw1();
// wo.print_onezero();
// wo.printsame();
 
 
	

	}

	private void print_onezero() {
		
		
		for (int line = 5;line>=1;line--)
		{
			for(int no = 1;no<=line;no++)
			{
				if(no%2==0)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(1+ " ");
				}
				
			}
			System.out.println();
		}
	}

	private void patternhw1() {
		
		for(int line = 1;line<=5;line++)
		{
			for(int no = 1;no<=5; no++ )
			{
				System.out.print( no+ " ");
			}
				
				System.out.println();
			
		}
	}

	private void task1() {
		
		for (int line = 5; line >=1;line--)
		{
			for(int no =1; no<=line;no++)
			{
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}

}
