//Lambda with Parameter
interface A{
    void show(String name);
}

public class Para {
    public static void main(String[] args) {
        A obj = (name) -> System.out.println("Hello "+ name);
        obj.show("Chetan");
    }
}
