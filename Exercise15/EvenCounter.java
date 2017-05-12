import java.util.Scanner; //importing the Scanner class

/**
 * class that counts even numbers that are greater than two entered by a user
 * @author: Anthony Jackson
 * @version: 1.0
 * */

/**
 * class that contains a method that recieves, greater than two, integers from the user and outputs the total of all even numbers
 * @method: evenCounter...prompts users for numbers returns the total of all even numbers entered.
 * */
public class EvenCounter {

    /**
     * @method: evenCounter()
     * creates scanner object 
     * prompts user for input explaining rules
     * @rules (#s must be greater than 2; only even #s go toward total returned; 0 exits user input; non-zero #s below two cause error and end input phase)
     * @return returns the total of all even #s from user input
     * */
    public int evenCounter() {
        
        // * @variable that will hold total of all even #s from user input
        int intTotal = 0;

        // * Creates new instance of scanner object
        Scanner objScanner = new Scanner(System.in);

        // * Prompts user for input and explains input rules
        System.out.println("Please enter any number of integers. These integers must be greater than two. Enter zero to end user input.");
        System.out.println("Any number entered that is less than two and not zero will cause an error and end the program.");

        // * variable that will hold integers entered by user
        int intInput = objScanner.nextInt();


        /*  do {
                if(u/i >= 2) {
                    if(u/i / 2 has remainder 0) {intTotal += u/i }}
                else { if(u/i = 0) {break loop}
                    Output(error not in range ending user input)
                    break loop }
            } while(u/i != 0)*/
        do {
           if(intInput >= 2) {
               if(intInput % 2 == 0) {
                   intTotal += intInput;
               }
           }
           else {
               if(intInput == 0) {
                   break;
               }
               System.err.println("Error:: Out of range input! User input is ending.");
               break;
           }

           intInput = objScanner.nextInt();
        } while(intInput != 0);

        // * @return: final total of all even #s from u/i.
        return intTotal;

    }
    public static void main(String [] strArgs) {

        //creates new instance of EvenCounter class
        EvenCounter objDriver = new EvenCounter();

        //Outputs a fucntion call to the evenCounter method of the EvenCounter class.
        System.out.println("\nThe total is: " + objDriver.evenCounter());
    }
}