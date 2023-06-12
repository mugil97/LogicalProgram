package Arrayprograms;

public abstract class Shapes {

	public static void main(String[] args) {

		//Instantiation  - Object Creation.
		//we cannnot instantiate abstract classes.
		Shapes square = new Shapes();
		Shapes rectangle = new Shapes();
		Shapes cone = new Shapes();
		square.calculate_area(40);
		rectangle.calculator_area(40,30);
	}

	abstract void calculate_area();
	
	
	 void calculator_area(int len, int bre) {

		System.out.println(len*bre);
		
	}

	 void calculate_area(int a) {
	
		System.out.println(a);
	}

}
