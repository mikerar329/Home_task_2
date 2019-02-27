import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        boolean palindrome = true;

        char num1[] = num.toCharArray();
        int i = 0, j = num1.length - 1;
        while(palindrome && i < j) {
            if (num1[i] != num1[j]) {
                palindrome = false;
            }
            i++;
            j--;


        }
        System.out.println(palindrome);
    }
}