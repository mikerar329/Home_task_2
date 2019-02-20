import java.util.Scanner;

public class HeadOrTail {

    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        boolean bool;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of attempts:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            bool = (Math.random() < 0.5);
            if (bool) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println("Heads: " + head + ", tails: " + tail);
    }

}

