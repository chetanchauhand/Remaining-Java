import java.io.File;
import java.io.IOException;
public class G {
    public static void main(String[] args) {
        File f = new File("s1.txt");
        
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
    }
}
