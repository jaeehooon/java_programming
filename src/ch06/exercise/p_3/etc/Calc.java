package ch06.exercise.p_3.etc;

public class Calc {
    // 필드
    private int x, y;           // 두 피연산자

    // 생성자
    public Calc() {}            // 기본 생성자
    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 두 필드의 덧셈결과를 반환하는 메소드
     *
     * @return      필드의 덧셈 결과
     */
    public int sum() {
        return this.x + this.y;
    }
}
