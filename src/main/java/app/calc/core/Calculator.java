package app.calc.core;

import app.calc.exception.CantCalculateException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Number> storage = new ArrayList<>();


    public Number calculate(int first, int second, String operator) throws RuntimeException {

        int result = 0;

        switch (operator) {
            case "+" -> {
                result = first + second;
            }
            case "-" -> {
                result = first - second;
            }
            case "*" -> {
                result = first * second;
            }
            case "/" -> {
                result = first / second;
            }
            default -> {
                throw new CantCalculateException("입력한 사칙연산이 올바르지 않습니다");
            }
        }

        return result;
    }

}
