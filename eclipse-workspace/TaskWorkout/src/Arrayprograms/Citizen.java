package Arrayprograms;

public class Citizen extends ParentCitizen implements Zoho,StateGovt{

	public static void main(String[] args) {
		
		Govt officer = new Citizen();
		officer.displayIDProof();
//		officer.watchMovies();

		Citizen citizen1 = new Citizen();
		Citizen citizen2 = new Citizen();
		
		citizen1.watchMovies();
	    citizen2.change2000Rupees();
	    citizen1.displayIDProof();
	    System.out.println(Govt.fine_for_helmet);
	    System.out.println(Govt.last_date);
	}
	
	public void watchMovies()
	  {
	    System.out.println("Watching Movies");
	  }

	@Override
	public void change2000Rupees() {
		// TODO Auto-generated method stub
		System.out.println("changing in bank");
	}

	@Override
	public void displayIDProof() {
		// TODO Auto-generated method stub
		System.out.println("License Proof");
	}

	@Override
	public void displayAddressProof() {
		// TODO Auto-generated method stub
		System.out.println("Ration Card");
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		System.out.println("Follow the traffic Rules");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provide_Electricity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}

}
