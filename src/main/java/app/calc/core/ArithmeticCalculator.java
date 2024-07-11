package app.calc.core;

import app.calc.core.operator.*;
import app.calc.exception.CantCalculateException;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator(List<Number> storage) {
        super(storage);
    }

    public Number calculate(int first, int second, String operator) throws RuntimeException {
        Operator oper;

        switch (operator) {
            case "+" -> oper = new AddOperator();
            case "-" -> oper = new SubtractOperator();
            case "*" -> oper = new MultiplyOperator();
            case "/" -> oper = new DivideOperator();
            case "%" -> oper = new ModOperator();

            default -> throw new CantCalculateException("입력한 사칙연산이 올바르지 않습니다");
        }
        return oper.operate(first, second);
    }
}
