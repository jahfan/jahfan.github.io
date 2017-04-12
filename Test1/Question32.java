//
// Name: Anthony Jackson
// Date: 2/23/17
// Course: ITSE 1302
// Program: Test 1, Question 32
// Description: Java program that simulates the rolling of a pair of dice.
//              Program generates a random number between 1 and 6 (inclusive)
//


//import the Random class
import java.util.Random;

public class Question32 {
    public static void main(String [] strArgs) {
        //Create a Random
        Random objRoll = new Random();

        //Use the random class twice. The next(6) makes random give the #s 0-5. So the + 1 changes those #s to 1-6.
        int intD6_1 = objRoll.nextInt(6) + 1;
        int intD6_2 = objRoll.nextInt(6) + 1;

        //Add both random instances to give the sum of the two dice.
        int intDiceSum = intD6_1 + intD6_2;

        //Output the results.
        System.out.println("The result of the first d6 is " + intD6_1 + ".");
        System.out.println("The result of the second d6 is " + intD6_2 + ".");
        System.out.println("The total of the two d6 rolls is " + intDiceSum + ".");
    }
}