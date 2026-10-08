interface A{
    void add(int a, int b);
}
public class Two {
    public static void main(String[] args) {
        A obj = (a,b) -> System.out.println(a+b);
        obj.add(2,3);
    }
}
