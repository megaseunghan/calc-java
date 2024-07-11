package app.calc.core.operator;

public class DivideOperator implements Operator {
    @Override
    public Number operate(int first, int second) {
        return first / second;
    }
}
