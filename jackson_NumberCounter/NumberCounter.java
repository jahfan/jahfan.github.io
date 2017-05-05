
import java.util.Scanner;

public class NumberCounter {

    public static void main (String [] strArgs) {
        
        final int SIZE = 51;
        int[] aryInstance = new int[SIZE];
         int intInput = 0;

        System.out.println("\nPlease enter integers between 0 and 50 inclusive. Feel free to enter as many numbers as you would like." +
                            "The program finishes taking in numbers if a number outside of the specified range is entered.");

        Scanner objScanner = new Scanner(System.in);                

        do {
           intInput = objScanner.nextInt();

            if(intInput >= 0 && intInput <= 50)  {
                aryInstance[intInput]++; 
            }
        } while(intInput >= 0 && intInput <= 50);
        
        for(int intCounter = 0; intCounter < SIZE; intCounter++) {
            if(aryInstance[intCounter] > 0) {
                System.out.println(intCounter + ": was entered " + aryInstance[intCounter] + " times.");
            }
        }

        System.out.println("All other numbers between 0 and 50 were entered 0 times.");
    }

}