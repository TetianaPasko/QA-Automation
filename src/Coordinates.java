import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coordinates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter x,y and z values: ");
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int z = Integer.parseInt(s3);

        if (x >= 0 && y >= 0 && z >= 0)
            System.out.println("Point lies in 1st octant");
        else if (x < 0 && y >= 0 && z >= 0)
            System.out.println("Point lies in 2nd octant");
        else if (x < 0 && y < 0 && z >= 0)
            System.out.println("Point lies in 3rd octant");
        else if (x >= 0 && y < 0 && z >= 0)
            System.out.println("Point lies in 4th octant");
        else if (x >= 0 && y >= 0)
            System.out.println("Point lies in 5th octant");
        else if (x < 0 && y >= 0)
            System.out.println("Point lies in 6th octant");
        else if (x < 0)
            System.out.println("Point lies in 7th octant");
        else
            System.out.println("Point lies in 8th octant");
    }
}
