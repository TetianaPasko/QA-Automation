import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any number: ");
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int b;
        int result = 0;
        while(a != 0) {
            b = a % 10;
            if (b % 2 == 0){
               result = result + b;
            }
            a = a / 10;
        }
        System.out.println(result);
    }


}
