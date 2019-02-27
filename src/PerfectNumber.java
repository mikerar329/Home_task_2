
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n)? "Perfect" : "Not perfect");
    }

    private static boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
         return a == sum;

        }
    }


