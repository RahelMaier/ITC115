   //Assignment:11
5th Ed of textbook p. 661, ex 2, Write a class Janitor to accompany the other law firm classes… and p.
662  Ex 3 , Write a class HarvardLawyer  to accompany the other law firm classes...
// 
	
public class Janitor extends Employee {


    public int getHours() {

        return 2 * super.getHours();

    }

    

    public double getSalary() {

        return super.getSalary() - 10000;

    }

    

    public int getVacationDays() {

        return super.getVacationDays() / 2;

    }

    

    public void clean() {

        System.out.println("Working' for the man.");

    }

}
   



public class HarvardLawyer extends Lawyer {


    public double getSalary() {

        return super.getSalary() * 1.2;

    }

    

    public int getVacationDays() {

        return super.getVacationDays() + 3;

    }

    

    public String getVacationForm() {

        String s = "";

        

        for (int i = 0; i < 4; i++) {

            s += super.getVacationForm();

        }

        

        return s;

    }

}


