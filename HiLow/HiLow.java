import java.util.Random;
import java.util.Scanner;

Scanner objScanClass = new Scanner(System.in);

public class HiLow {
    private int intNumber;

    public int setNumber(pintGuess) {
        System.out.println("Choosing a number between 1 and 100.");
        this.intNumber = pintNumber;
    }

    public void getNumber(pintGuess) {
        return this.intNumber;
    }

    public int Guesser(pintGuess) {
        System.out.println("The number has been set. Start guessing!");
        this.intGuess = pintGuess;

        while(this.intGuess != this.intNumber) {
            System.out.println("Oh no! You guessed incorrectly! Please try again. You can do it!");
            intGuess = objectScanClass.nextInt();
        }

        System.out.println("Woo! You did it! Your number was " + this.intGuess + " and the random number was " + intNumber + ". Congratulations!");
    }
}
