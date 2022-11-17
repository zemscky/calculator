package skypro.homework.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import skypro.homework.calculator.service.CalcService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalcTest {
    Integer num1;
    Integer num2;

    @Test
    public void getResultPlus() {
        num1 = 5;
        num2 = 10;
        Integer expected = CalcService.plus(num1,num2);
        assertNotNull(expected);
    }
    @Test
    public void getResultMinus() {
        num1 = 5;
        num2 = 10;
        Integer expected = CalcService.minus(num1,num2);
        assertNotNull(expected);
    }
    @Test
    public void getResultMultiply() {
        num1 = 5;
        num2 = 10;
        Integer expected = CalcService.multiply(num1,num2);
        assertNotNull(expected);
    }
    @Test
    public void getResultDivide() {
        num1 = 5;
        num2 = 10;
        if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        Integer expected = CalcService.divide(num1,num2);
        assertNotNull(expected);
    }
}
