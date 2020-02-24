import java.util.*;
 
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int i=0; i<100; i++) {
    	  if (isPowerOfTwo(i)) {
    		  System.out.println(i);
    	  }
    	  if  (isPowerOfTwoA(i)) {              
    		  System.out.println(i); 
    	  }
      }
	}
	  public static boolean isPowerOfTwo (int n) {        
		  int reduced = n;
		  if (n<1) {             
			  return false; 
		  }
		  while (reduced>1) {            
			  if (reduced%2 == 0) { 
				  reduced = reduced/2;
			  }
			  else {                 
				  return false; 
			  }
		  }
		  return true; 
	  }
	  public static boolean isPowerOfTwoA (int n) {       
		  int pow = 1; 
		  while (pow<=n) {          
			  if (n==pow) { 
				  return true; 
			  }
			  pow = 2*pow; 
		  }
		  return false; 
	  }
}
