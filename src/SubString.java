import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string: ");
        String s = reader.readLine();
        System.out.println("Please enter index: ");
        String i = reader.readLine();
        int index = Integer.parseInt(i);
        String result = "";
        for (int j = index; j < s.length(); j++) {
            result = result + s.charAt(j);
        }
        System.out.println("Substring: " + result);
    }
}
