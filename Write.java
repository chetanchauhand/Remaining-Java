
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter("st.txt");
        w.write("Hello Chetan");
        w.close();

        System.out.println("Data Written");
    }
}