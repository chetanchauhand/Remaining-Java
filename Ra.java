import java.util.ArrayList;

public class Ra {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(41);

        list.removeIf(x -> x%2 != 0);
        System.out.println(list);
    }
}
