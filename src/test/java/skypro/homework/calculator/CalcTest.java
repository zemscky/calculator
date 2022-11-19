package skypro.homework.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;
import skypro.homework.calculator.service.CalcService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    private static Stream<Arguments> provideParameters(){
        return Stream.of(
                Arguments.of(5, 10),
                Arguments.of(5, 0));
    }

    @ParameterizedTest
    @MethodSource(value = "provideParameters")
    public void getResultPlus(Integer num1, Integer num2) {
        int actual = CalcService.plus(num1,num2);
        int expected = num1 + num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource(value = "provideParameters")
    public void getResultMinus(Integer num1, Integer num2) {
        int actual = CalcService.minus(num1,num2);
        int expected = num1 - num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource(value = "provideParameters")
    public void getResultMultiply(Integer num1, Integer num2) {
        int actual = CalcService.multiply(num1,num2);
        int expected = num1 * num2;
        assertEquals(expected, actual);

    }
    @ParameterizedTest
    @MethodSource(value = "provideParameters")
    public void getResultDivide(Integer num1, Integer num2) {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> CalcService.divide(num1,0));
        int actual = CalcService.divide(num1,num2);
        int expected = num1 / num2;
        assertEquals(expected, actual);
    }

}
