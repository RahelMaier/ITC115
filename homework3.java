// Write a method called repl that accepts a String and a number of repetitions...


public class homework3 {

	public static void main(String[] args) {

		System.out.println(repl("Rahel",5));
// this method well repl my name five times.
		

	}

	public static String repl(String str, int times) {

		String tmp = "";

		for (int i = 0 ; i < times; i++) {

			tmp = tmp + str;

			//Amp += star;

		}

		return tmp;

	}
	}

