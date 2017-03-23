//
// Name: Anthony Jackson
// Course: COSC 1336
// Date Last Edited: 3/23/17
// Assignment: Exercise 13
// Description: Driver for the class HiLow.java called HiLowDriver, whose main method instantiates a HiLow object.
//

//Imported the Random and Scanner libaries since both are used in this class
import java.util.Random;
import java.util.Scanner;

public class HiLowDriver{
    public static void main(String [] strArgs) {
    
    //initialized variables and objects used in the class.
    int intRandom;
    Random objRandom = new Random();
    Scanner objScanner = new Scanner(System.in);

    //Gave the variable intRandom a random # between 1 and 100.
    intRandom = objRandom.nextInt(100) + 1;
     
     //Initialized a new instance of the HiLow.java class.
    HiLow objGame = new HiLow();

    //Called the setNumber function in the HiLow class and gave its parameter the value stored in intRandom
    objGame.setNumber(intRandom);

    //The line commented out below gives the value of the randomly generated number. Makes it easier to test when you know what the answer is.
    //System.out.println(objGame.getNumber());

    //Called the Guesser function in the HiLow class and gave its parameter an integer input by the user.
    objGame.Guesser(objScanner.nextInt());
    }
}