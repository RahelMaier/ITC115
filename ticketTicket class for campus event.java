//*******************************************************************
//Ticket class for campus event//

// Description of the class or method purpose
//By: Rahel 
//Date 03 17 20
//****************************************************************


public class BuyTicket {



    public static void main(String[] args){



    WalkupTicket wt1=new WalkupTicket(12);

 

    System.out.println(wt1);



    AdvanceTicket at1=new AdvanceTicket (13,12);



    System.out.println(at1);



    AdvanceTicket at2 = new AdvanceTicket(14,2);



    System.out.println(at2);



    StudentAdvanceTicket sat1= new StudentAdvanceTicket(15,20);



    System.out.println(sat1);



    StudentAdvanceTicket sat2= new StudentAdvanceTicket(16,4);



    System.out.println(sat2);



    }



    }



  // 2nd This serves as the superclass for the SameDayTicket and AdvanceTicket, but doesn't really get called itself in the test.


public class Ticket {

    

 
  

    double price = 50.00;

    int ticketIDNumber;

    


  

    public Ticket (int ticketIDNumber) {

        this.ticketIDNumber = ticketIDNumber;

    }

    

   

    public double getPrice() {

        return price;

    }

    

  

    public String toString() {

        return String.format("Ticket Details: \nTicket ID = %d\nFull Price: $%.2f\n", 

                                this.ticketIDNumber, this.getPrice());

    }

    

}
