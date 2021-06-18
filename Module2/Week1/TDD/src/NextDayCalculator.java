public class NextDayCalculator {
    public static  boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static String NextDay(int day, int month, int year){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31)) {
                day = 1;
                month++;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
                day = 1;
                month++;
            } else if ((month == 2) && isLeapYear(year)) {
                if (day == 28) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                }
            } else if ((month == 2) && !isLeapYear(year)) {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            } else if ((month == 12) && (day == 31)) {
                day = 1;
                month = 1;
                year++;
            } else {
                day++;
            }

        return String.valueOf((int)day+"/"+ (int)month+"/"+ (int)year);
    }
}


