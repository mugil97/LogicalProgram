package Basicsofjava;

public class EShowRoom {
	
	int price;
	int discount;

	public static void main(String[] args) {
		EShowRoom tv = new EShowRoom();
		EShowRoom fridge = new EShowRoom();
		EShowRoom wm = new EShowRoom();
		EShowRoom ac = new EShowRoom(25000, 5);
		
		ac.buy();
	}
	
	private void buy() {
		// TODO Auto-generated method stub
		System.out.println(price);
		System.out.println(discount);
	}

	EShowRoom()
	{
		System.out.println("Welcome to our EShowRoom ");
	}
	
	public EShowRoom(int price, int discount) {
		
		// TODO Auto-generated constructor stub
		this.price = price;
		this.discount = discount;
		System.out.println("Price is " + price);
		System.out.println("Discount is " + discount);
	}
}
