import java.util.Random;

public class Test1 {
    public static void main(String [] strArgs) {
        Random gen = new Random();
        int range = gen.nextInt() * 10 - 5;

        int intTest = 10 / 0;
        System.out.println(range);
    }
}