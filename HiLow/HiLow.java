
//
// Name: Anthony Jackson
// Course: COSC 1336
// Date Last Edited: 3/23/17
// Assignment: Exercise 13
// Description: Class called HiLow.java contains the necessary functions required to play a game of HiLow.
//

//Imported the Scanner library since it was used later in this program.
import java.util.Scanner;

public class HiLow {

    //Initialized the variables and objects used in this class.
    private int intNumber;
    private int intGuess;
    Scanner objScanClass = new Scanner(System.in);

    //Function that sets the variable intNumber to the randomly generated parameter pintNumber when called. 
    public void setNumber(int pintNumber) {
        System.out.println("Choosing a number between 1 and 100.");
        this.intNumber = pintNumber;
        System.out.println("The number has been set. Start guessing!");
    }

    //Function that returns the variable intNumber when called
    public int getNumber() {
        return this.intNumber;
    }

    //Function that sets the variable intGuess to the user-defined parameter pintGuess when called.
    //Function then uses while and if loops to play a game of HiLow with that user being able to change intGuess to make further guesses.
    public void Guesser(int pintGuess) {
        
        this.intGuess = pintGuess;

        /*
            while(guess != random#) {
                
                if (guess > 100 || guess < 0)
                    Sys.out.print("Not in range!")
                else if(guess < random#)
                    System.out.print("Too Low")    
                else
                    Sys.out.print("Too High!")    
            }*/
        while(this.intGuess != this.intNumber) {
            
            
            if(this.intGuess > 100 || this.intGuess < 0) {
                System.out.println("Oh no! Your number is outside of range! Please pick a number between 1 and 100.");
            }
            else if(this.intGuess < this.intNumber) {
                System.out.println("Oh no! Your guess was too low! Please try again. You can do it!");
            }
            else {
              System.out.println("Oh no! Your guess was too high! Please try again. You can do it!");  
            }
            
            //Updates intGuess to a different integer supplies by the user.
            intGuess = objScanClass.nextInt();
        }

        //Winning statement that also provides the guess and the randomly-generated # for testing purposes.
        System.out.println("Woo! You did it! Your guess was " + this.intGuess + " and the random number was " + intNumber + ". Congratulations!");
    }
}
