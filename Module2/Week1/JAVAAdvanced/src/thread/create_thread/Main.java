package thread.create_thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator(1);
        number1.start();
        NumberGenerator number2 = new NumberGenerator(2);
        number2.start();
        System.out.println("Main thread run is over" );
    }
}
