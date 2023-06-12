package Arrayprograms;

public class ShapesChild extends Shapes{

	

	@Override //Annotation
	void calculate_area() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		ShapesChild sc = new ShapesChild();

		
		sc.calculator_area(10, 20);
		sc.calculate_area(0);
	}
}
