import java.io.File;
import java.io.IOException;

public class Del {
    public static void main(String[] args) {
        File f = new File("src.txt");
        if(f.delete()){
            System.out.println("file deleted");
        }
        else{
            System.out.println("not deleted");
        }
    }
}
