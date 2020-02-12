import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
	   
	    calculateGpa();
	  }
	  public static void calculateGpa() {
	    
	   @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	   System.out.print("How many classes are you taking? ");
	   int numClasses = scanner.nextInt();
	   System.out.println("");
	   
	   
	    String[] listOfGrades = new String[numClasses];
	   double gradeAggregate = requestGrades(listOfGrades);
	    
	    printGrades(listOfGrades);
	    
	    printGpa(listOfGrades,gradeAggregate);
	  
	    
	  }
	  
	  
	  public static double requestGrades(String[] listOfGrades) {
	    Scanner scanner = new Scanner(System.in);
	    int counter = 0;
	    double gradeAggregate = 0;
	    while (counter < listOfGrades.length) {
	      gradeAggregate += requestGrade(scanner, counter, listOfGrades);
	      counter++;
	    }
	    return gradeAggregate;
	  }
	  
	  public static void printGpa(String[] listOfGrades, double gradeAggregate) {
	    System.out.println(gradeAggregate / listOfGrades.length);
	  }
	  
	  public static void printGrades(String[] listOfGrades) {
	    int counter = 0;
	    while (counter < listOfGrades.length) {
	      System.out.println("Course " + (counter+1) + " " + listOfGrades[counter]);
	      counter++;
	    }
	  }
	  
	  public static double requestGrade(Scanner scanner, int counter, String[] listOfGrades) {
	    String courseEntry;

	    System.out.println("What is your grade in course " + (counter + 1) + "?");
	    courseEntry = scanner.next(); 
	    listOfGrades[counter] = courseEntry;

	    switch (courseEntry) {
	      case "A":
	        return 4;
	      case "A-":
	        return 3.7;
	      case "B+":
	        return 3.3;
	      case "B":
	        return 3.0;
	      case "B-":
	        return 2.7;
	      case "C+":
	        return 2.3;
	      case "C":
	        return 2;
	      case "C-":
	        return 1.7;
	      case "D+":
	        return 1.3;
	      case "D":
	        return 1.00;
	      case "D-":
	        return 0.7;
	      default: 
	        return 0.0; 
	      }
	  }
	}
	
	