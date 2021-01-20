package ch04.exercise.p_11;
/**
 * 실습 문제 11
 *
 * 다수의 클래스(덧셈, 뺄셈, 곱셈, 나눗셈)를 활용하여 계산기 역할을 하는 프로그램
 */
public class CalcApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();         // Calculator 객체 생성
        calc.run();                                 // 프로그램 실행
    }
}