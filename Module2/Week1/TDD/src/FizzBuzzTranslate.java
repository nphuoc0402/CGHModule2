
public class FizzBuzzTranslate {
    public static String translate(int number) {
        String result = "";
        if(number % 3 == 0 && number % 5 == 0){
            result = "FizzBuzz";
        }else if(number % 3 == 0){
            result = "Fizz";
        }else if(number % 5 == 0){
            result = "Buzz";
        }else result = ReadNumberToString(number) ; //or  String.valueOf(((int) number));
        return result;
    }


        private static final String[] tens = {
                "","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
        };

        private static final String[] ones = {
                ""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine","ten","eleven",
                "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
        };

        private static String ReadNumberToString(int number) {
            String result;
            if (number == 0) { return "zero";}
            if (number % 100 < 20) {
                result = ones[number % 100];
                number /= 100;
            } else {
                result = ones[number % 10];
                number /= 10;

                result = tens[number % 10] + result;
                number /= 10;
            }
            if (number == 0) return result;
            return ones[number] + " hundred " + result;
        }

    }

