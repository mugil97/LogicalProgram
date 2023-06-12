package com.learning;
public class Loopingpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Loopingpractice lp = new Loopingpractice ();
	lp.commondivgcd(100,120);
	}
void commondivgcd(int no1, int no2)
{
	int div = 2;
	int gcd = 0;
	int small = no1 < no2 ? no1 : no2;
	while (div<small)
	{
		if(no1 % div==0 && no2 % div ==0)
		{ 
			gcd= div;
		}
		div = div + 1;
	}
	System.out.println("gcd is "+ gcd);
}
}
