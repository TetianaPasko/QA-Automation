import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string: ");
        String s = reader.readLine();
        if (s.length() == 0 || s.length() == 1) {
            System.out.println(s + " is a Palindrome");
            return;
        }
        boolean palindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome? " + palindrome);
    }
}