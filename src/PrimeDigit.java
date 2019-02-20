
import java.util.Scanner;

public class PrimeDigit {
    public static void main(String args[]) {
        int temp;
        int i = 2;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");

        int num = scan.nextInt();

        while (isPrime && i <= num / 2) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + " - is Prime");
        } else {
            System.out.println(num + " - is'nt Prime");
        }
    }
}