package ch05.exercise.p_11;

import ch03.example.ex_3_14.DivideByZero;

class Div extends Calc {
    // 필드

    // 생성자
    public Div() {}         // 기본 생성자

    /**
     * 덧셈을 계산하는 메소드
     */
    @Override
    int calculate() {
        int result = 0;
        try {
            result = this.a / this.b;
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
        }
        return result;
    }

    /**
     * 피연산자 값을 객체 내에 저장하는 메소드
     *
     * @param a     피연산자 a
     * @param b     피연산자 b
     */
    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
