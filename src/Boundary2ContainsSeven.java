import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boundary2ContainsSeven {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter boundaries: ");
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int sum = 0;
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            if (s.contains("7")) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        if (sum == 0) {
            System.out.println("No numbers which applies on condition.");
        } else {
            System.out.println(sum);
        }
    }
}
