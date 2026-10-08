//Simple lambda
interface A{
    void show();
}

public class Lamb {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello Java");
        obj.show();
    }
}
