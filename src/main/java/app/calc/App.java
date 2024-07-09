package app.calc;

import java.util.Scanner;

public class App {

    private static final int MAX_INDEX = 10;
    private int[] results = new int[MAX_INDEX];

    public static void main(String[] args) {

        App calculator = new App();

        int index = 0;

        String input = "";

        while (true) {

            if (input.equals("exit")) break;

            Scanner sc = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요");
            int firstNum = Integer.parseInt(sc.nextLine());

            System.out.println("두 번째 숫자를 입력하세요");
            int secondNum = Integer.parseInt(sc.nextLine());

            System.out.println("사칙연산 기호를 입력하세요");
            String operator = sc.nextLine();

            int result = 0;

            try {
                result = calculator.calculate(firstNum, secondNum, operator);
                calculator.push(result, index++);
                System.out.printf("결과: %d", result);
            } catch (Exception e) {
                System.out.printf("에러 발생 : %s", e.getMessage());
            }

            System.out.println("\n더 계산하시겠습니까? (exit 입력 시 종료)");
            input = sc.nextLine();
        }
    }

    public int calculate(int first, int second, String operator) throws RuntimeException {

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
                throw new RuntimeException("입력한 사칙연산이 올바르지 않습니다");
            }
        }

        return result;
    }

    public void push(int element, int index) {
        if (index >= MAX_INDEX - 1) { // 저장 인덱스 초과시 배열 내 값 이동
            for (int i = 0; i < MAX_INDEX - 2; i++) {
                results[i] = results[i + 1];
            }
            results[MAX_INDEX - 1] = element;
        } else {
            results[index] = element;
        }
    }
}
