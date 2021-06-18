import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test   
    void nextDay() {
        assertEquals("2/1/2018",NextDayCalculator.NextDay(1,1,2018));
        assertEquals("30/1/2018",NextDayCalculator.NextDay(29,1,2018));
        assertEquals("1/5/2018",NextDayCalculator.NextDay(30,4,2018));
        assertEquals("1/3/2018",NextDayCalculator.NextDay(28,2,2018));
        assertEquals("1/3/2020",NextDayCalculator.NextDay(29,2,2020));
        assertEquals("1/1/2019",NextDayCalculator.NextDay(31,12,2018));




    }



}