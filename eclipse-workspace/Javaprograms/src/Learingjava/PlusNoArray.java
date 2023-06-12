package Learingjava;

public class PlusNoArray {

	public static void main(String[] args) {
		int [] a = {10,20,30};
		int [] b = {30,20,10};
		int [] c = new int[a.length];
		for(int i = 0;i<c.length;i++)
		{
			c[i] = a[i]+b[i];
		}
	}
}
