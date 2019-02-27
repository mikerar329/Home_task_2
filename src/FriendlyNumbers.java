import java.util.Scanner;

public class FriendlyNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        long startTime = System.currentTimeMillis();
        int sum = 0;
        int sum1 = 0;
        int temp = 0;
        for (int i = a; i < b + 1; i++) { //перебор всех чисел диапазона
            for (int div = 1; div < (i / 2) + 1; div++) { //перебор делителей
                if (i % div == 0) {
                    sum += div;
                }

            }
            if (sum > a && sum <= b) {
                temp = sum;
                for (int j = 1; j < (sum / 2) + 1; j++) {
                    if (sum % j == 0) {
                        sum1 += j;
                    }
                }
            }
            if (sum == temp && sum1 == i && temp != i && temp < i) {

                System.out.println("Numbers " + sum + " and " + sum1);
            }
            sum = 0;
            sum1 = 0;
            temp = 0;

        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");

    }


}