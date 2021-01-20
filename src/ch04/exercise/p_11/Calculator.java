package ch04.exercise.p_11;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4개의 클래스(Add, Sub, Mul, Div)를 활용하여 계산기 역할을 하는 클래스
 */
class Calculator {
    // 필드
    int a, b;                   // 정수형 피연산자
    Scanner input;              // Scanner 객체 레퍼런스

    // 생성자
    public Calculator() {}      // 기본 연산자

    /**
     * 계산기 프로그램을 실행하는 메소드
     */
    public void run() {
        input = new Scanner(System.in);                 // Scanner 객체 생성

        while (true) {                                  // 사용자가 두 개의 피연산자와 연산자를 올바르게 입력할떄까지 반복
            System.out.print("두 정수와 연산자를 입력하시오 >> ");
            try {
                a = input.nextInt();            // 피연산자 입력
                b = input.nextInt();            // 피연산자 입력
            } catch (InputMismatchException e) {
                System.out.println("잘못된 타입의 피연산자를 입력했습니다.\n");
                input.nextLine();               // 버퍼 비우기
                continue;
            }

            String s = input.next();            // 연산자 입력
            char op = s.charAt(0);              // 문자열로 입력을 받았기 때문에 문자열의 첫번째 문자를 택함

            int result = calc(a, b, op);        // 연산 객체 호출
            if (result == -1) {
                System.out.println("잘못된 연산자 입력입니다!\n");
                continue;
            }
            System.out.println(result);         // 연산 결과 출력
            break;                              // 연산 결과 출력 후 반복문 종료
        }
        input.close();                      // Scanner 객체 닫기
    }

    /**
     * 연산자에 따른 객체 생성을 하는 메소드
     *
     * @param a     피연산자
     * @param b     피연산자
     * @param op    연산자
     */
    private int calc(int a, int b, char op) {
        int result;                     // 연산 결과를 담는 변수

        if (op == '+') {
            Add add = new Add();
            add.setValue(a, b);             // 두개의 피연산자 설정
            result = add.calculate();       // 연산 실행
        }
        else if (op == '-') {
            Sub sub = new Sub();
            sub.setValue(a, b);             // 두개의 피연산자 설정
            result = sub.calculate();       // 연산 실행
        }
        else if (op == '*') {
            Mul mul = new Mul();
            mul.setValue(a, b);             // 두개의 피연산자 설정
            result = mul.calculate();       // 연산 실행
        }
        else if (op == '/') {
            Div div = new Div();
            div.setValue(a, b);             // 두개의 피연산자 설정
            result = div.calculate();       // 연산 실행
        }
        else {
            return -1;
        }
        return result;
    }
}
