package app.calc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        int firstNum = Integer.parseInt(sc.nextLine());

        System.out.println("두 번째 숫자를 입력하세요");
        int secondNum = Integer.parseInt(sc.nextLine());

        System.out.println("사칙연산 기호를 입력하세요");
        String operator = sc.nextLine();

        int result = 0;

        try {
            result = calculate(firstNum, secondNum, operator);
            System.out.printf("결과: %d", result);
        } catch (Exception e) {
            System.out.printf("에러 발생 : %s", e.getMessage());
        }

    }

    private static int calculate(int first, int second, String operator) throws RuntimeException {

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
}