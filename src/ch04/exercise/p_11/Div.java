package ch04.exercise.p_11;

/**
 * 나눗셈 역할을 하는 클래스
 */
class Div {
    // 필드
    int a, b;           // 정수형 두 피연산자

    // 생성자
    public Div() {}     // 기본 생성자

    /**
     * 인자로 받은 두 개의 정수형 숫자를 피연사자로 설장하는 메소드
     *
     * @param a     정수형 피연산자
     * @param b     정수형 피연산자
     */
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * 본 클래스의 역할을 하는 계산을 하는 메소드
     * 여기서는 덧셈을 한 결과를 반환한다.
     *
     * @return  두 피연산자의 나눗셈 결과
     */
    int calculate() {
        int result = 0;
        try {
            result = a / b;             // 나눗셈 실행
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
        }
        return result;
    }
}
