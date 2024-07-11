package app.calc;

import app.calc.core.ArithmeticCalculator;
import app.calc.core.CircleCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String input = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 사칙연산 계산기\n2. 원의 넓이 계산기");
        String choose = sc.nextLine();

        if (choose.equals("1")) {
            ArithmeticCalculator calculator = new ArithmeticCalculator(new ArrayList<>());

            while (true) {

                if (input.equals("exit")) break;

                if (input.equals("remove")) calculator.removeFirst();

                if (input.equals("inquiry")) calculator.inquiry();

                sc = new Scanner(System.in);


                System.out.println("\n첫 번째 숫자를 입력하세요");
                int firstNum = Integer.parseInt(sc.nextLine());

                System.out.println("두 번째 숫자를 입력하세요");
                int secondNum = Integer.parseInt(sc.nextLine());

                System.out.println("사칙연산 기호를 입력하세요");
                String operator = sc.nextLine();

                try {
                    Number result = calculator.calculate(firstNum, secondNum, operator);
                    calculator.add(result);
                    System.out.printf("결과: %d\n", result);
                } catch (Exception e) {
                    System.out.printf("에러 발생 : %s", e.getMessage());
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = sc.nextLine();

            }
        } else if (choose.equals("2")) {

            CircleCalculator calculator = new CircleCalculator(new ArrayList<>());

            while (true) {
                if (input.equals("exit")) break;

                System.out.println("반지름을 입력하세요");
                double radius = Double.parseDouble(sc.nextLine());

                double area = calculator.calculate(radius);
                System.out.println("원의 면적: " + area);
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = sc.nextLine();
            }
        }
    }
}
