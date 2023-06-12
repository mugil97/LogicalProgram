package Learingjava;

public class ShiftLeftArray {
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    ForLoopDemo fl = new ForLoopDemo();
	    fl.print_reverse();
	    /*int[] ar = {10,20,30,40}; 
	  for(int j=1; j<=2; j++) {
	    //ar = fl.shift_array_left(ar);*/
	  }
//	    ar = fl.shift_array_left(ar);
//	    ar = fl.shift_array_left(ar);
	    
		//
		  //for(int i=0; i<ar.length;i++) { System.out.print(ar[i] + " "); }
		 // System.out.println(); }
		 

	  private int[] shift_array_left(int[] a) {
	    // TODO Auto-generated method stub
	    int temp = a[0]; 

	    int i = 0; 

	    while(i<a.length-1)
	    {
	    a[i] = a[i+1]; 
	  //  System.out.print(a[i] + " "); 
	    i++; 
	    }
	    a[i] = temp; 
	    //System.out.print(a[i] + " "); 
	    return a; 
	    
	  }
}
