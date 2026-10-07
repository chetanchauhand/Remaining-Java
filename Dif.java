//Generics with different types.

import javax.swing.Box;

class data <T>{
    T value;
    data (T value){
       this.value = value;
    }
    void show(){
        System.out.println(value);
    }
}

public class Dif {

    public static void main(String[] args) {
        data<Integer> a = new data<>(10);
        data<String> b = new data<>("Hello");
        a.show();
        b.show();
    }
}
