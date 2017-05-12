import java.util.Random; //Imported the random package

/**
* @author: Anthony Jackson
* @version: 1.0
**/

/**
* class that rolls a pair of dice 1000 and counts the occurence of box cars (pair of sixes)
* class creates to random objects of #'s 1-6(dice)
* class users for loop to roll both random objects 1000 times each
* in foor loop after every roll checks to see if a boxcar occured if so, adds one to the variable that counts boxcar occurences
**/
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
