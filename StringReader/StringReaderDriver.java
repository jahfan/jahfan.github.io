//
// Name: Anthony Jackson
// Class: ITSE 1302
// Program: Exercise 14
// Description: Program that calls class StringReader.java and then uses user input to throught the program.
//

//Imports that Scanner in order to use user input.
import java.util.Scanner;

public class StringReaderDriver {

    public static void main (String [] strArgs) {

        //Creates an instance of Scanner and the StringReader classes.
        Scanner objScanner = new Scanner(System.in);
        StringReader objStringRead = new StringReader();

        //Asks the user for a string.
        System.out.println("Please enter a word.");
        //Uses the recieved word to set the word in StringReader to the user input.
        objStringRead.setWord(objScanner.next());
        //calls the vowel function to count the vowels in the user submitted string.
        objStringRead.countVowels();
    }
}