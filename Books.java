


public class Book {

    
    private String title;

    
    private String author;


    private double price;



  

    public String getTitle() {

        return this.title;

    }



   
    public void setTitle(String title) {

        this.title = title;

    }




    public String getAuthor() {

        return this.author;

    }




    public void setAuthor(String author) {

        this.author = author;

    }



  

    public void setPrice(double price) {

        if (price > 0) {

            this.price = price;

        } else {

            System.out.println("Invalid price");

        }

    }



   

    public double getPrice() {

        return this.price;

    }



    public void sell(int qty) {

        System.out.println("Total: $" + (qty * price));

    }

}



public class Magazine {

   

    private String title;

   
    private String issue;

   

    private double price;



   

    public String getTitle() {

        return this.title;

    }



   

    public void setTitle(String title) {

        this.title = title;

    }



   

    public String getIssue() {

        return this.issue;

    }



   

    public void setIssue(String issue) {

        this.issue = issue;

    }



    

    public void setPrice(double price) {

        if (price > 0) {

            this.price = price;

        } else {

            System.out.println("Invalid price");

        }

    }



    public double getPrice() {

        return this.price;

    }



    public void sell(int qty) {

        System.out.println("Total: $" + (qty * price));

    }

}






public class video DVDs and CDs {

	   

    private String title;

   
    private String issue;

   

    private double price;



   

    public String getTitle() {

        return this.title;

    }



   

    public void setTitle(String title) {

        this.title = title;

    }



   

    public String getIssue() {

        return this.issue;

    }



   

    public void setIssue(String issue) {

        this.issue = issue;

    }



    

    public void setPrice(double price) {

        if (price > 0) {

            this.price = price;

        } else {

            System.out.println("Invalid price");

        }

    }



    public double getPrice() {

        return this.price;

    }



    public void sell(int qty) {

        System.out.println("Total: $" + (qty * price));

    }

}
