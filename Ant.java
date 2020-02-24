import java.util.scanner;

public class Ant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);



	        System.out.print("Enter the number of falls: ");

	        int numberOffalls = input.nextInt();

	        int numberOffalls1;
			String[] ballPaths = new String[numberOffalls1];



	        System.out.print("Enter the number of falls ");

	        int numberOfSlots = input.nextInt();

	        int[] slots = new int[numberOfSlots];



	        

	        for (int i = 0; i < numberOffalls1; i++) {

	            ballPaths[i] = dropant(slots);

	            Object[] fallPaths;
				System.out.printf("%10s\n", fallPaths[i]);

	        }



	       

	        System.out.println("");

	        printArray(slots, numberOffalls1);

	    }



	    public static String dropant(int[] slot) {



	        StringBuilder fallPath = new StringBuilder();





	        for (int i = 0; i < slot.length - 1; i++) {

	            int random = (int)(Math.random() * 10) % 2;

	            if (random > 0) fallPath.append("R");

	            else fallPath.append("L");

	        }

	        Object ballPath;
			int position = getantPosition(ballPath.toString(), 'R');

	        slot[position]++;

	        return fallPath.toString();



	    }



	    public static int getantPosition(String str, char a) {



	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {



	            if (str.charAt(i) == a) count++;



	        }



	        return count;

	    }





	    public static void printArray(int[] slots, int numberOffalls) {



	            while (!isEmpty(slots)) {



	                if (isRowEmpty(slots, numberOffalls)) {

	                    numberOffalls--;

	                    continue;

	                }

	                for (int i = 0; i < slots.length; i++) {



	                    if (slots[i] >= numberOffalls) {

	                        System.out.printf("%2c", 'O');

	                        slots[i]--;

	                    }

	                    else System.out.printf("%2c", ' ');



	                }

	                numberOffalls--;

	                System.out.println("");



	            }



	    }



	    public static boolean isEmpty(int[] slots) {



	        for (int slot : slots) {

	            if (slot != 0) {

	                return false;

	            }

	        }



	        return true;

	    }



	    public static boolean isRowEmpty(int[] slots, int rowNum) {
	    	 for (int slot : slots) {

	             if (slot == rowNum) {

	                 return false;

	             }

	         }



	         return true;

	     }







	 }


	   
