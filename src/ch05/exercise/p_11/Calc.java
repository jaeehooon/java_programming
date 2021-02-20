package ch05.exercise.p_11;

abstract class Calc {
    // 필드
    int a, b;                                   // 피연산자
    abstract void setValue(int a, int b);
    abstract int calculate();
}
