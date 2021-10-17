package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    public void shouldReturnSumOnTwoNumbersDelimitedBycomma() {
    	StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator .add("1,2"));
    	
    }
    @Test
    public void moreDigitsSupported() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(77, stringCalculator.calculate("22,55"));
    }
    @Test
    public void allowNnumersAsInput() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(45, stringCalculator.calculate("1,2,3,4,5,6,7,8,9"));
    }
    @Test
    public void supportNewLineAsSeparator() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.calculate("1\n2,3"));
    }
}
