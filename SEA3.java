//*******************************************************************

//  Your method should compute the absolute difference between the sum 

  of the boys' integers and the sum of the girls' integers.
//
// Description of the class or method purpose
//By: Rahel 
//Date 02 14 20
//****************************************************************


public void boyGirl(Scanner sc) {

    int boyCount = 0;

    int boySum = 0;

    int girlCount = 0;

    int girlSum = 0;

    

    while(sc.hasNext()) {

        sc.next();

        boyCount++;

        boySum += sc.nextInt();

        

        if(!sc.hasNext())

            break;

        

        sc.next();

        girlCount++;

        girlSum += sc.nextInt();

    }

    

    System.out.println(boyCount + " boys, " + girlCount + " girls");

    System.out.println("Difference between boys' and girls' sums: " + 

        Math.abs(boySum - girlSum));

}
