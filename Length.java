// find length
import java.io.File;
import java.io.IOException;

public class Length {
    public static void main(String[] args) {
        File f = new File("s.txt");
        System.out.println("size"+f.length()+"bytes");
    }
}
