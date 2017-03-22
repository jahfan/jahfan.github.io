import java.util.Random;
import java.util.Random;

public static void main(String [] strArgs) {
    Hello obj;
    obj = new Hello ("Hi there.");

    Random objRandom = new Random();
     

    System.out.println(obj);
    HiLow objGame = new HiLow();
    objGame.setNumber(objRandom.nextInt(100) + 1);
    System.out.println(objGame.getNumber);
    objGame.guesser();
}