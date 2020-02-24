// this program includes the class declaration etc so that it can run – this isn’t
// needed for a correct answer import java.util.*; 
 
import java.util.scanner;

public class Ant {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		 int height = 0;        
		 int falls = 0; 
		 while (height<6) {            
			 int r = rand.nextInt(2); 
			 while (height<6) {            
				 int r = rand.nextInt(2);
				 // 50% chance the ant will fall
				 if (r==0) {
					 // ant fell 
					 height = 0; 
					 falls++; 
				 } else { 
					 // ant climbs a step 
					 height++; 
				 }
				 
			 }
			 System.out.println("number of falls: " + falls); 
		 }
		 
		}
	
