package ch05.exercise.p_11;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 실습문제 11번
 *
 * Calc 클래스를 상속받은 Add, Sub, Mul, Div 클래스를 활용한 계산기 프로그램
 */
public class CalcApp {
    // 필드
    static int a, b;                        // 피연산자
    static Scanner input;                   // Scanner 객체 레퍼런스

    /**
     * CalcApp을 실행시키는 메소드
     */
    static void run() {
        input = new Scanner(System.in);                 // Scanner 객체 생성

        while (true) {                                  // 사용자가 두 개의 피연산자와 연산자를 올바르게 입력할떄까지 반복
            System.out.print("두 정수와 연산자를 입력하시오 >> ");
            try {
                a = input.nextInt();            // 피연산자 입력
                b = input.nextInt();            // 피연산자 입력
            } catch (InputMismatchException e) {
                System.out.println("잘못된 타입의 피연산자를 입력했습니다.\n정수를 입력하세요!\n\n");
                input.nextLine();               // 버퍼 비우기
                continue;
            }

            String s = input.next();            // 연산자 입력
            char op = s.charAt(0);              // 문자열로 입력을 받았기 때문에 문자열의 첫번째 문자를 택함

            if (op == '+') {
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
            }
            else if (op == '-') {
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
            }
            else if (op == '*') {
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
            }
            else if (op == '/') {
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
            }
            else {
                System.out.println("연산자를 잘못 입력했습니다!");
                continue;
            }
            break;

        }
        input.close();                      // Scanner 객체 닫기
    }

    public static void main(String[] args) {
        CalcApp.run();
    }
}
