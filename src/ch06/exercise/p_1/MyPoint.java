package ch06.exercise.p_1;

public class MyPoint {
    // 필드
    private int x, y;               // x, y 좌표

    // 생성자
    public MyPoint() {}     // 기본 생성자
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 인자로 받은 MyPoint 객체가 현재 객체와 동일한 좌표인지 판별하는 메소드
     *
     * @param mp    MyPoint 객체
     * @return      같은점이면 true,
     *              다른 점이면 false 반환
     */
    public boolean equals(MyPoint mp) {
        if (this.x == mp.x && this.y == mp.y)
            return true;
        return false;
    }

    /**
     * 현재 객체정보를 문자열로 표현하는 메소드
     */
    public String toString() {
        return "Point (" + this.x + ", " + this.y + ")";
    }
}
