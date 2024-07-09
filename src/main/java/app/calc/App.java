package app.calc;

import java.util.*;

public class App {

    private List<Integer> results = new ArrayList<Integer>();

    public static void main(String[] args) {

        App calculator = new App();

        String input = "";

        while (true) {

            if (input.equals("exit")) break;

            if (input.equals("remove")) calculator.results.remove(0);

            Scanner sc = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요");
            int firstNum = Integer.parseInt(sc.nextLine());

            System.out.println("두 번째 숫자를 입력하세요");
            int secondNum = Integer.parseInt(sc.nextLine());

            System.out.println("사칙연산 기호를 입력하세요");
            String operator = sc.nextLine();

            try {
                int result = calculator.calculate(firstNum, secondNum, operator);
                calculator.results.add(result);
                System.out.printf("결과: %d\n", result);
            } catch (Exception e) {
                System.out.printf("에러 발생 : %s", e.getMessage());
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
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
}
