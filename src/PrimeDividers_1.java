import java.util.Scanner;


public class PrimeDividers_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:");
        int number = sc.nextInt();
        boolean flag;

        for(int divider = 2; number != 1; divider++){
            flag = false;
            while (number % divider == 0) {
                flag = true;
                number /= divider;
            }
            if (flag) {
                System.out.println(divider);
            }
        }
    }

}
