//Lambda For even
interface A{
    boolean check(int x);
}
public class For {
    public static void main(String[] args) {
        A obj = x -> x%2 == 0;
        System.out.println(obj.check(10));
    }
}
