import java.util.Scanner;

public class Nok_Nod_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int i = (number1 < number2 ? number1 : number2);
        while (i % number1 != 0 || i % number2 != 0) {
            i++;
        }
        System.out.println("NOK " + i);
        System.out.println("NOD is " + (number1 * number2)/i);
    }
}
