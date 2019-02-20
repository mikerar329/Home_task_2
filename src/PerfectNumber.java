import java.lang.ref.SoftReference;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }

    private static boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (a == sum) {
            return true;
        } else {
            return false;
        }
    }

}
