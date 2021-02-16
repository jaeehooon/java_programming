package ch05.exercise.p_5;

import ch05.exercise.p_1.ColorTV;

/**
 * Point 클래스를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스
 */
public class ColorPoint extends Point {
    // 필드
    private String color;                   // 색깔 변수

    // 생성자
    public ColorPoint() {}
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    /**
     * 좌표를 설정하는 메소드
     *
     * @param x     x 좌표
     * @param y     y 좌표
     */
    void setXY(int x, int y) {
        move(x, y);
    }

    /**
     * 색깔을 설정하는 메소드
     *
     * @param color     설정할 색깔
     */
    void setColor(String color) {
        this.color = color;
    }

    /**
     * ColorPoint 클래스의 toString
     *
     * @return      객체 정보를 출력하는 메소드
     */
    public String toString() {
        return (this.color + "색의 (" + getX() + ", " + getY() + ")의 점");
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }

}
