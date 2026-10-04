//Cretae folder 
import java.io.File;
public class Fold {
    public static void main(String[] args) {
        File f = new File("Myfolder");

        if(f.mkdir()){
            System.out.println("Folder created");
        }
        else{
            System.out.println("not created");
        }
    }
}
