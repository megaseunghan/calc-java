package app.calc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        int firstNum = Integer.parseInt(sc.nextLine());

        System.out.println("두 번째 숫자를 입력하세요");
        int secondNum = Integer.parseInt(sc.nextLine());

    }

}