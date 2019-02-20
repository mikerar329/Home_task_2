import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DifferentDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        Set<Integer> digits = new HashSet<>();

        while (number1 != 0) {
            digits.add(number1 % 10);
            number1 /= 10;
        }
        System.out.println(digits.size());
    }
}

