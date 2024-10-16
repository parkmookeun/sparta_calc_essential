package sparta.essential;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        /* 반복문 시작 */
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            /* 위 요구사항에 맞게 소스 코드 수정 */
            calc.calculate(operator, num1, num2);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = sc.next();
            if (input.equals("exit")) break;

            if (input.equals("remove")) {
                LinkedList<Integer> list = calc.getList();
                Integer poll = list.poll();
                if (poll == null) {
                    System.out.println("삭제할 값이 없습니다.");
                } else {
                    System.out.println(poll + " 값이 삭제 되었습니다!");
                }
            }
            /* 반복문 종료 */
        }
    }
}
