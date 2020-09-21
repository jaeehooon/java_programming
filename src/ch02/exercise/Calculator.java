package ch02.exercise;
import java.util.Scanner;

/**
 * 실습 문제 12번
 *
 * 사칙 연산을 입력 받아 계산하는 프로그램
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner 객체 생성

        System.out.print("연산 >> ");     // 피연산자와 연산자를 한 줄에 입력. 빈칸으로 분리하여 입력한다.
        int x = input.nextInt();
        String op = input.next();
        int y = input.nextInt();

        calculate1(x, y, op);
        calculate2(x, y, op);

        input.close();
    }


    /**
     * 연산자에 따라 두 숫자를 연산하는 메소드
     * if-else 문으로 구현
     *
     * @param x     정수
     * @param y     정수
     * @param op    연산자
     */
    public static void calculate1(int x, int y, String op) {
        if (op.equals("+"))
            System.out.println(x + op + y + "의 결과는 " + (x + y));
        else if (op.equals("-"))
            System.out.println(x + op + y + "의 결과는 " + (x - y));
        else if (op.equals("*"))
            System.out.println(x + op + y + "의 결과는 " + (x * y));
        else if (op.equals("/"))
            System.out.println(x + op + y + "의 결과는 " + (x / y));
        else
            System.out.println("잘못된 입력입니다.");
    }


    /**
     * 연산자에 따라 두 숫자를 연산하는 메소드
     * switch 문으로 구현
     *
     * @param x     정수
     * @param y     정수
     * @param op    연산자
     */
    public static void calculate2(int x, int y, String op) {
        switch (op) {
            case "+":
                System.out.println(x + op + y + "의 결과는 " + (x + y));
                break;
            case "-":
                System.out.println(x + op + y + "의 결과는 " + (x - y));
                break;
            case "*":
                System.out.println(x + op + y + "의 결과는 " + (x * y));
                break;
            case "/":
                System.out.println(x + op + y + "의 결과는 " + (x / y));
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

}
