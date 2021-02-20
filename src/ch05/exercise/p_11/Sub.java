package ch05.exercise.p_11;

class Sub extends Calc {
    // 필드

    // 생성자
    public Sub() {}         // 기본 생성자

    /**
     * 뺄셈을 계산하는 메소드
     */
    @Override
    int calculate() {
        return this.a - this.b;
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
