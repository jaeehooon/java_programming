package ch06.example.ex_6_2;
/**
 * 예제 6-2 | Object 클래스에 toString() 작성
 */

/**
 * 좌표를 나타내는 Point 클래스
 */
class Point {
    // 필드
    int x, y;               // x, y좌표

    // 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 객체를 문자열로 출력하는 메소드
     */
    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println(p.toString());               //
        System.out.println(p);                          // p는 p.toString()으로 자동 변
        System.out.println(p + "입니다.");                // p.toSTring(0 + "입니다." 로 자동변환
    }
}
