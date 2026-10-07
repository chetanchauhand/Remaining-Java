//Generic method to find maximum
class demo{
    public <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }
}


public class Meth {
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println(d.max("Chetan","Ankit"));
        System.out.println(d.max(100,101));
    }
}
