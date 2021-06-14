import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void translate() {
        int number1 = 137;
        int number2 = 15;
        int number3 = 12;
        int number4 = 25;
        assertEquals(" one hundred thirty seven",FizzBuzzTranslate.translate(number1));
        assertEquals("FizzBuzz",FizzBuzzTranslate.translate(number2));
        assertEquals("Fizz",FizzBuzzTranslate.translate(number3));
        assertEquals("Buzz",FizzBuzzTranslate.translate(number4));

    }

}