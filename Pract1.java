//Add first and last element in list.
import java.util.LinkedList;

public class Pract1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.addFirst("C");
        list.addLast("Python");
    // Remove element from list
        list.remove("Java");
        System.out.println(list);
    }
}
