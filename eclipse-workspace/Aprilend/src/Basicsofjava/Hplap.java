package Basicsofjava;


public class Hplap extends Laptop{
	
	public static void main(String[] args)
	{
		Hplap hp = new Hplap();
		hp.browse();
		hp.playgames();
		hp.doProgram();
		hp.touch_screen();
		System.out.println("dell.harddisk");
	}
	void touch_screen()
	{
		System.out.println("Touch Screen");
	}
}
