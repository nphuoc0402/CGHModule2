package thread.count;

public class Count implements Runnable{
    private Thread myThread;

    public Count(){
        this.myThread = new Thread(this,"my runnable thread");
        System.out.printf("My thread cread " + myThread + "\n");
        myThread.start();

    }

    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i <  10; i++){
                System.out.printf("print the count %d\n",i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.printf("myThread is interrupted\n");
        }
        System.out.printf("my thread run is over\n");
    }
}
