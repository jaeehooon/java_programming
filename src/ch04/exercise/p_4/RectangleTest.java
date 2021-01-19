package ch04.exercise.p_4;

/**
 * 실습 문제 4
 *
 * 직사각형을 표현하는 Rectangle 클래스를 활용하여
 * 객체의 정보를 출력하는 프로그램
 */

class Rectangle {
    // 필드
    int x, y;           // 사각형을 구성하는 점.(left, top)
    int width, height;  // 가로, 세로 길이

    // 생성자
    public Rectangle() {}       // 기본 생성자
    public Rectangle(int x, int y, int width, int height) {
        this.x = x; this.y = y;
        this.width = width; this.height = height;
    }

    /**
     * Rectangle객체의 사각형 면적을 반환하는 메소드
     *
     * @return      사각형 넓이
     */
    int square() {
        return width * height;
    }

    /**
     * 객체의 정보를 출력하는 메소드
     *
     * (left, top) 점에서부터 가로x세로 사이즈를 보여줌
     */
    void show() {
        System.out.println("(" + this.x + ", " + this.y + ")에서 크기가 " + this.width + "x" + this.height + "인 사각형");
    }

    /**
     * 인자로 받은 Rectangle 객체를 본 객체(this)가 포함하고 있는지 아닌지 판별하는 메소드
     * (문제에서는 사각형의 변이 겹치면 포함하지 않는 것으로 판단하는듯!)
     *
     * @param r     Rectangle 객체
     * @return      인자로 받은 객체를 포함하면 true,
     *              포함하지 않으면 false를 반환
     */
    boolean contains(Rectangle r) {
        return (this.x < r.x) && (this.y < r.y) && (this.x + this.width > r.x + r.width) && (this.y + this.height > r.y + r.height);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);        // Rectangle 객체 r 생성
        Rectangle s = new Rectangle(5, 5, 6, 6);        // Rectangle 객체 s 생성
        Rectangle t = new Rectangle(1, 1, 10, 10);      // Rectangle 객체 t 생성

        r.show();           // 객체 r의 정보를 출력
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if (t.contains(s))
            System.out.println("t는 s를 포함합니다.");
    }
}
