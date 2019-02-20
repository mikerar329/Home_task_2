import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        if (isPalindrome(a)) {
            System.out.println("Palindrome");
        }
    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}