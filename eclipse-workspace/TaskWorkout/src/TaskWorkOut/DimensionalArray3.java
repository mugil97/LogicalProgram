package TaskWorkOut;

public class DimensionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DimensionalArray3 da = new DimensionalArray3();
		da.array3();
		
		}

	private void array3() {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = {{10,11,12},{13,14,15},{16,17,18}};
		 
		int [][] c = new int[3][3];
		
	for(int i = 0;i<a.length;i++)
	{
		for(int j = 0;j<a.length;j++)
		{
			c[i][j] = a[i][j]+b[i][j];
			System.out.print(c[i][j]+ " ");
		}
	}
		
	}

}
