//Contain and search
import java.util.HashSet;

public class Pract6 {
    public static void main(String[] args) {
         HashSet<Integer> set = new HashSet<>();
         set.add(100);
         set.add(101);
         set.add(102);
         set.remove(102);
         System.out.println(set);
         
         System.out.println(set.contains(104));
    }
}
