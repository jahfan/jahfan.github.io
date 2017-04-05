//
// Name: Anthony Jackson
// Date Last Edited: 4/4/17
// Program: Exercise 16 
// Description: A program that rolls two dice one thousand times and counts the number of times that a box car (two sixes) occurs.
//


//Imported the random class
import java.util.Random;

public class Exercise16 {

    public static void main(String[] strArgs) {

        //Instanced two Random objection.
        Random objDie1 = new Random();
        Random objDie2 = new Random();
        
        //Variable to count box cars
        int intBoxCar = 0;

        /* psuedo code for for loop
        for(count =1; count < 1000; count++){

            intialize the two random objs to roll d6s.

            if( d61 = 6 && d62 = 6) 
                #ofBoxCar++;
        }
        */
        for(int intCounter = 1; intCounter <= 1000; intCounter++) {
            
            int intRoll1 = objDie1.nextInt(6) + 1;
            int intRoll2 = objDie2.nextInt(6) + 1;

            if (intRoll1 == 6 && intRoll2 == 6) {
                intBoxCar++;
            }
        }

        //Outputs # of time box car occured
        System.out.println(intBoxCar + " box cars occured.");
    }
}