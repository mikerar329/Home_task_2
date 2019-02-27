import java.util.Scanner;

public class HeadOrTail {

    public static void main(String[] args) {
        int head = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 of attempts:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                head++;
            }
        }
        System.out.println("Heads: " + head + ", tails: " + (n - head));
    }

}

