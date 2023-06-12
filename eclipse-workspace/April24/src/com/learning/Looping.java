package com.learning;

public class Looping {

	public static void main(String[] args) {
	Looping ll = new Looping();
	ll.print_11111();
//	ll.addition_of_n_number();
	ll.find_factorial(5);
}

	private void print_11111() {
		// TODO Auto-generated method stub
		int box = 0;
		int no = 1;
		while(no<=5) {
			
		box = box + no;
		System.out.print(1 + " ");
		no = no + 1;
		}
		
	}
	
}
