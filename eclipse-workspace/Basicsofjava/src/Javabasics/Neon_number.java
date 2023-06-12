package Javabasics;

public class Neon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Neon_number nn = new Neon_number();
		int power = nn.find_neon(9,2);
		//System.out.println(power);
		int sum = nn.find_neon_2(81);
		if(power== sum)
		 System.out.println("given no is  neon no");
		}

	private int find_neon_2(int no) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		while (no>0)
		{
		int rem = no%10;
		sum = sum + rem; //1 //8 1+8=9
		no = no/10;
		}
		return sum;
	}

	private int find_neon(int base, int power) {
		// TODO Auto-generated method stub
		
		
		int box = 1;
		while(power>0)
		{
		box = box * base;
		power = power - 1;
		}
		return box;
	}

	}


