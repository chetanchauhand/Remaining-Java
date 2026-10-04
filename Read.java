// Read data from file
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Read {
    public static void main(String[] args) throws IOException {
        File f = new File("s.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
