import java.util.Scanner;

public class Highest_digit {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int maxNum = 0;
            while (num != 0) {
                if (maxNum < num % 10) {
                    maxNum = num % 10;
                }
                num /= 10;
            }
            System.out.print("Max digit is " + maxNum);
        } catch (Exception ex) {
            System.out.println("Error");

        }

    }
}

