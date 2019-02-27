import java.util.Scanner;


public class DifferentDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       String numbers = sc.nextLine();
        int count = 0;
        for (int j = 0; j < 10; j++){
         if (numbers.contains(String.valueOf(j))){
             count++;
           }
        }
        System.out.println(count);
        }
    }



