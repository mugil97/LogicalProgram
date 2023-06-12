package Thanjavur;

public class son extends Father {
	
	int age = 45;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s = new son();
		s.share_assets();
		s.yield();
		int father_amount = s.getAmount();
		System.out.println("before" + father_amount);
		s.setAmount(110000000);
		father_amount = s.getAmount();
		System.out.println("after" + father_amount);
	
		System.out.println(s.age);
		Father f = new Father();
		System.out.println(f.age);
		s.work();
		
		
		
	}
	void work()
	{
		System.out.println(this.age);
		System.out.println(super.age);
	}

}
