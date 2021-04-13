import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boundary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter boundaries: ");
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        for (int i = a; i <= b; i++) {
            int rem = i % 7;
            if (rem == 1 || rem == 2 || rem == 5){
                System.out.println(i);
            }
        }
    }
}
