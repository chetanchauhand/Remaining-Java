public class Nam {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running");
        });

        t.start();
    }
}
