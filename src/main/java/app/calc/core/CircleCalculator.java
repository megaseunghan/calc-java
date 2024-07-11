package app.calc.core;

import java.util.List;

public class CircleCalculator extends Calculator {

    // 파이의 값은 바뀌지 않기 때문에 static, final의 특성을 모두 갖기 때문에 3.14로 초기화 한 뒤
    // JVM의 런타임 데이터 영역 중 메소드 영역에서 모든 스레드에 공유되게 한다.
    private static final double PI = 3.14;

    public CircleCalculator(List<Number> storage) {
        super(storage);
    }

    public double calculate(double radius) {
        return Math.pow(radius, 2) * PI;
    }
}
