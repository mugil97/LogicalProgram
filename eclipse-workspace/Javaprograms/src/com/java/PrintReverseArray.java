package com.java;

public class PrintReverseArray {

	public static void main(String[] args) {
		
		PrintReverseArray pra = new PrintReverseArray();
	//	pra.reverse();
//		pra.print();
//		pra.mid_5digit();
		pra.mid_7digit();
		
		
			
	}

	private void mid_7digit() {
		// TODO Auto-generated method stub
		char [] name = {'m', 'u', 'g', 'i', 'l', 'a', 'n'};
		char [] name2 = new char[name.length];
		int i = 0; int j = name.length-1;
		while(i<name.length)
		{
			name2[i] = name[j];
			i++; j--;
		}
		System.out.println(name2[i]);
	}

	private void mid_5digit() {
		// TODO Auto-generated method stub
		char [] name = {'z','a','a','r','a'};
		int mid= name.length/2;
		System.out.println(name[mid]);		
	}

	private void print() {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50};
		int [] b = new int[a.length];
		int total = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(i%2==0)
			{
				total = total + a[i];
			}
		} 
//		System.out.println("total no is : " + total);
	}

	private void reverse() {
		
		
		int [] a = {10,20,30,40};
		int [] b = new int[a.length];
		
		int i = 0;
		int j = a.length-1;
		while(i<a.length)
		{
			b[i] = a[j];
			i++;
			j--;
		}
		System.out.println(b[i]);
	}
}
