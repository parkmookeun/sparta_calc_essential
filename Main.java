package sparta.essential;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        String operations = "+-*/";

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("사칙연산 기호를 입력하세요: ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("연산을 종료합니다...");
                break;
            }

            char op = input.charAt(0);
            while (!operations.contains(String.valueOf(op))) {
                System.out.println("연산 기호를 다시 입력해주세요!");
                System.out.print("사칙연산 기호를 입력하세요: ");
                input = sc.next();
                if (input.equals("exit")) {
                    System.out.println("연산을 종료합니다...");
                    return;
                }
                op = input.charAt(0);
            }
            System.out.print("첫번째 수: ");
            int num1 = sc.nextInt();
            System.out.print("두번째 수: ");
            int num2 = sc.nextInt();
            while (op == '/' && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다!");
                System.out.print("두번째 수: ");
                num2 = sc.nextInt();
            }

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            System.out.println("연산 결과: " + result);
        }

    }
}
