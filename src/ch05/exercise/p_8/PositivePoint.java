package ch05.exercise.p_8;

/**
 * Point 클래스를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스
 */
public class PositivePoint extends Point {
    // 필드

    // 생성자
    public PositivePoint() {}           // 기본 생성자
    public PositivePoint(int x, int y) {
        super(x, y);
        if (getX() < 0 || getY() < 0)
            move(0, 0);
    }

    /**
     * ColorPoint 클래스의 toString
     *
     * @return      객체 정보를 출력하는 메소드
     */
    public String toString() {
        return ("(" + getX() + ", " + getY() + ")의 점");
    }

    /**
     * 양수의 공간만을 인자로 받아 좌표를 이동하는 메소드
     *
     * @param x     이동할 x 좌표
     * @param y     이동할 y 좌표
     */
    @Override
    public void move(int x, int y) {
        if (x >= 0 && y >= 0)
            super.move(x, y);
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();      // PositivePoint 객체 생성
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);                  // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
