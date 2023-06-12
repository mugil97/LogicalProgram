package Basicsofjava;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		System.out.println(ch.balance);
		ch.receive();
		ch.develop_java_applications();
	
		Parent pa = new Child();
     	pa.cook();
		pa.receive();
	}
	public void develop_java_applications()
	  {
	    System.out.println("Java Developer");
	  }

	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("Taking care " + "of Relative and friends");
//		Parent p = new Parent();
//		super.receive();
		
	}
	

}
