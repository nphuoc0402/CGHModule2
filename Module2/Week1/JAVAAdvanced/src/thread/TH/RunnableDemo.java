package thread.TH;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.printf("Creating %s\n",threadName);
    }



    @Override
    public void run() {
        System.out.printf("Running %s\n",threadName);
        try{
            for (int i =4; i > 0; i--){
                System.out.printf("Thread name %s, %d\n",threadName,i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.printf("Thread %s interrupted\n",threadName);
        }
        System.out.printf("Thread %s is exiting.\n",threadName);
    }

    public void start(){
        System.out.printf("Thread %s starting\n",threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
