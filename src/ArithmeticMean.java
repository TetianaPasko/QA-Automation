import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter array: ");
        String[] data = reader.readLine().split(" ");
        int[] numbers = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }
        float avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg = avg + numbers[i];
        }
        System.out.println("Arithmetic mean is " + avg / numbers.length);
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
