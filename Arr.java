// Generic method to print array
class demo{
    public <T> void print(T[] arr){
        for (T x : arr){
            System.out.println(x);
        }

    }
}

public class Arr {
    public static void main(String[] args) {
        Integer arr[] = {10,20,30};
        demo d = new demo();
        d.print(arr);
    }
}
