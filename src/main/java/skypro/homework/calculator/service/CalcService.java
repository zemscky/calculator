package skypro.homework.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public static int plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Все параметры должны быть переданы");
        }
        return num1 + num2;
    }
    public static int minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Все параметры должны быть переданы");
        }
        return num1 - num2;
    }
    public static int multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Все параметры должны быть переданы");
        }
        return num1 * num2;
    }
    public static int divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Все параметры должны быть переданы");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        return num1 / num2;
    }

}
