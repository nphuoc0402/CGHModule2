public class TriangleClassifier {
    public static String Triangle(int a, int b, int c){

        if(a + b > c && b + c > a && a + c > b){
            if(a == b && b == c){
                return  "tam giác đều";
            }else if(a == b || a == c){
                return  "tam giác cân";
            }else{
                return  "tam giác thường";
            }
        }else {
            return "không phải là tam giác";
        }
    }

}
