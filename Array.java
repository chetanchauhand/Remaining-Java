import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.forEach(x -> System.out.println(x));
    }
}
