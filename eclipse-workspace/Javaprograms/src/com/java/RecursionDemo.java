package com.java;

public class RecursionDemo {

	public static void main(String[] args) {

		RecursionDemo rd = new RecursionDemo();
		rd.display(10);
	}

	private void display(int no) {
		
		System.out.println(no);
		no = no + 10;
		if(no<=50)
		{
		display(no);
	}
	}
}
