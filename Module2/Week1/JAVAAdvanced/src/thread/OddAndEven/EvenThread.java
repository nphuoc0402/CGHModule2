package thread.OddAndEven;

public class EvenThread extends Thread{
    public EvenThread(){

    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\n", i);
            }
        }
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
