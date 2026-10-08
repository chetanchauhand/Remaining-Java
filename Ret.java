//Lambda with return value
interface A{
    int square(int x);
}

public class Ret {
     public static void main(String[] args) {
        A obj = x -> x*x;
        System.out.println(obj.square(5));
     }    
}
