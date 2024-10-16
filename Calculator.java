package sparta.essential;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private Queue<Integer> list;
    private static final String operations = "+-*/";

    public Calculator() {
        list = new LinkedList<>();
    }

    public LinkedList<Integer> getList() {
        return (LinkedList<Integer>) list;
    }

    public void setList(LinkedList<Integer> list) {
        this.list = list;
    }

    public void calculate(char op, int num1, int num2) {
        int result = 0;

        if (!operations.contains(String.valueOf(op))) {
            System.out.println("사칙연산자 기호를 입력하세요!");
            return;
        }
        if (op == '/' && num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
            return;
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
        list.add(result);
        System.out.println("현재 리스트: " + list.toString());
    }
}
