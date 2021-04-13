import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter N Fibonacci value: ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int m) {
        if(m == 0 || m == 1) {
            return m;
        } else {
            return fibonacci(m - 1) + fibonacci(m - 2);
        }
    }
}
