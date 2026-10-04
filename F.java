
import java.io.File;
import java.io.IOException;

public class F {
    public static void main(String[] args) throws IOException {
        File name = new File("st.txt");
        name.createNewFile();
        System.out.println("File Created"+ name.exists());
    }
}