package thread.OddAndEven;

class ThreadTest {
    ThreadTest() {
    }

    public static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();

        try {
            t1.join();
            t2.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}