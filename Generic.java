// Generic method
class demo{
    public <T> void show(T value){
        System.out.println(value);
    }
}

public class Generic {
    public static void main(String[] args) {
        demo d = new demo();
        d.show(100);
        d.show("Hello");
        d.show(10.4);
        d.show(2+2);
    }
}
