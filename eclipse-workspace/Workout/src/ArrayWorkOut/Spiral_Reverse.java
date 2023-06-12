package ArrayWorkOut;

public class Spiral_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] s= new int[5][5];
		int no = 1;
		int MinRow = 0;int MaxRow = 4; int MinCol = 0; int MaxCol = 4;
		
		
		while(no<=25)
		{
		for(int Col = MaxCol;Col>=MinCol;Col--)
		{
			s[MinRow][Col] = no;
			no++;
		}MinRow++;
		
//		int MinRow = 1;
		for(int Row = MinRow;Row<=MaxRow;Row++ )
		{
			s[Row][MinCol] = no;
			no++;
		}
		MinCol++;
		
//		int MinCol = 1;
		for(int Col = MinCol;Col<=MaxCol;Col++)
		{
			s[MaxRow][Col] = no;
			no++;
		}
		MaxRow--;
		
//		int MaxRow = 3;
		for(int Row = MaxRow;Row>=MinRow;Row--) 
		{
			s[Row][MaxCol] = no;
			no++;
		}
		MaxCol--;
		}
		
		for(int row=0; row<=4; row++)
	    {
	      for(int col=0; col<=4; col++)
	      {
	        System.out.print(s[row][col]+"  ");
	      }
	      System.out.println();
	    }
		
		
////		int MaxCol = 3;
//		for(int Col = MaxCol;Col>=MinCol;Col--)
//		{
//			s[MinRow][Col] = no;
//			no++;
//		}MinRow++;
//		
////		int MinRow = 2;
//			
//		for(int Row = MinRow; Row<=MaxRow;Row++)
//		{
//			s[Row][MinCol] = no;
//			no++;
//		}
		
		
	}

}
