import java.util.Scanner;
import java.util.Random;

public class HeadOrTail {

    public static void main(String[] args) {
        int head = 0;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 of attempts:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (rnd.nextBoolean()) {
                head++;
            }
        }
        System.out.println("Heads: " + head + ", tails: " + (n - head));
    }

}

