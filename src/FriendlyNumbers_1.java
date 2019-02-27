import java.util.Scanner;

public class FriendlyNumbers_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        int sum1 = 0;
        int temp = 0;
        for (int i = a; i < b + 1; i++) { //перебор всех чисел диапазона
            sum += sumCount(i, sum);

            if (sum > a && sum <= b) {
                temp = sum;
                sum1 += sumCount(sum, sum1);
            }

            if (sum1 == i && temp != i && temp < i) {
                System.out.println("Numbers " + sum + " and " + sum1);
            }
            sum = 0;
            sum1 = 0;
            temp = 0;

        }

    }


    private static int sumCount(int i, int sum) {
        for (int div = 1; div < (i / 2) + 1; div++) { //перебор делителей
            if (i % div == 0) {
                sum += div;
            }
        }
        return sum;
    }
}