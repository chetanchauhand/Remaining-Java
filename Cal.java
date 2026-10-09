interface A{
    int calculate(int a ,int b);
}
public class Cal {
    public static void main(String[] args) {
        A add = (a,b) -> a+b;
            System.out.println(add.calculate(4, 3));
        }
    }

