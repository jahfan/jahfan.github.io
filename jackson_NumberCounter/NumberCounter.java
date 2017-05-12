
import java.util.Scanner; //imp[orts the Scanner package

/**
* @author: Anthony Jackson
* @version: 1.0
*/

/**
* class that creates an array of number 0-50
* class prompts user for to input integers between 0-50. Once an integer outside of that range is input collection stops
* while user is input integers class was counting the amount of times user input numbers within the collection range
* class then uses for to see if a number was entered more than once, if so outputs message telling how many times number was entered
* class outputs a message to cover every number with 0 occurences of user input
**/
public class NumberCounter {

    public static void main (String [] strArgs) {
        
        //creates ary with #'s 0-50
        final int SIZE = 51;
        int[] aryInstance = new int[SIZE];
        
        //variable to store user input
         int intInput = 0;
    
        //tells user how program works and then prompts for input.
        System.out.println("\nPlease enter integers between 0 and 50 inclusive. Feel free to enter as many numbers as you would like." +
                            "The program finishes taking in numbers if a number outside of the specified range is entered.");

        Scanner objScanner = new Scanner(System.in);                

        /*do {
            int = userinput
            if(userinput in range(0-50)) { ary[userInput++]}
          } (while userinput in range);*/
        do {
           intInput = objScanner.nextInt();

            if(intInput >= 0 && intInput <= 50)  {
                aryInstance[intInput]++; 
            }
        } while(intInput >= 0 && intInput <= 50);
        
        /*
        for(ary[0] -> ary[50]) {
            if(ary[forloop iteration] > 0) { Ouput("ary[iteration] was output #storednum of times") }
        }
        }*/
        for(int intCounter = 0; intCounter < SIZE; intCounter++) {
            if(aryInstance[intCounter] > 0) {
                System.out.println(intCounter + ": was entered " + aryInstance[intCounter] + " times.");
            }
        }
    
        //statement that covers every number with zero user input occerencses.
        System.out.println("All other numbers between 0 and 50 were entered 0 times.");
    }

}
