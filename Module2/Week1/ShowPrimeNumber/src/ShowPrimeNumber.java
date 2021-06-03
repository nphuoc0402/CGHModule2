import static java.lang.System.out;

public class ShowPrimeNumber {
    public static void main(String[] args) {
        for(int i = 2;i<100;i++){
            boolean check = true;
            for(int j = 2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    check = false;
                }
            }
            if(check){
                out.printf("%d ",i);
            }
        }
    }
}
