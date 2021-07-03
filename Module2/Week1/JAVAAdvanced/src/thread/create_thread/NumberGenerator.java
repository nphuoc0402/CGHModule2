package thread.create_thread;

public class NumberGenerator implements Runnable{
        private Thread t;
        private int id = 1;

    public  NumberGenerator(int id) {
            this.id = id;
            System.out.println("Creating " + id);
        }

    @Override
        public void run() {
            System.out.println("Running " + id);
            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Thread: " + id + ", " + i);
                    // Dừng vòng lặp trong 50 ms
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + id + " interrupted.");
            }
            System.out.println("Thread " + id + " exiting.");
        }

        public void start() {
            System.out.println("Starting " + id);
            if (t == null) {
                t = new Thread(this, String.valueOf(id));
                t.start();
            }
        }
    }


