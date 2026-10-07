// Generics class with string
class Box<T>{
     T value;

Box (T value){
    this.value = value;

}
   void show(){
    System.out.println(value);
   }

}

public class Gen {
    public static void main(String[] args) {
        Box<String> b = new Box<>("Java");
        b.show();
    }
    
}
