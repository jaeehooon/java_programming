package ch06.example.ex_6_3;

/**
 * 예제 6-3 | Point 클래스에 equals() 작성
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
     * 두 점의 좌표가 같으면 true 를 반환하는 메소드
     *
     * @param obj       객체
     * @return          두 점의 좌표가 같으면 true 를,
     *                  같지 않으면 false 반환
     */
    public boolean equals(Object obj) {
        Point p = (Point)obj;               // 객체 obj 를 Point 타입으로 다운 캐스팅
        if (x == p.x && y == p.y)
            return true;
        else return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);

        if (a == b)             // false
            System.out.println("a==b");
        if (a.equals(b))        // true
            System.out.println("a is equal to b");
        if (a.equals(c))        // false
            System.out.println("a is equal to c");
    }
}
