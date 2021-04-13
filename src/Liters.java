import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Liters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter liters amount: ");
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        System.out.println(a * 0.26417);
    }
}
