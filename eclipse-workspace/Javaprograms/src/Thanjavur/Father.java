package Thanjavur;

public class Father {
	
	private int amount = 100000000;
	
	int age = 75;
	
	public int getAmount()
	
	{
		return amount;
	}

	public void setAmount(int amount) {
		if(amount<100000000)
		this.amount = amount;
	}

	void yield()
	{
		System.out.println("Yield paddy");
	}
	protected void share_assets()
	{
		System.out.println("Sharing Assets");
	}
}
