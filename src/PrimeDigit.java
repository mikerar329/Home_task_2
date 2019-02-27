
import java.util.Scanner;

public class PrimeDigit {
    public static void main(String args[]) {
        int i = 2;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");

        int num = scan.nextInt();

        while (isPrime && i < (num / 2 + 1)) {

            if (num % i == 0) {
                isPrime = false;
            }
            i++;
        }
        System.out.println(num + (isPrime ? " - is Prime" : " - is'nt Prime"));

    }
}