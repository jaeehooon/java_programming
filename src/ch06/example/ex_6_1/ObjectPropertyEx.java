package ch06.example.ex_6_1;
/**
 * 예제 6-1 | Object 클래스로 객체의 속성 알아내기
 */

/**
 * 좌표를 나타내는 Point 클래스
 */
class Point {
    // 필드
    int x, y;

    // 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 *
 */
public class ObjectPropertyEx {

    /**
     * 객체 정보를 출력하는 static 메소드
     *
     * @param obj   객체
     */
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());               // 클래스 이름
        System.out.println(obj.hashCode());                         // 해시코드 값
        System.out.println(obj.toString());                         // 객체를 문자열로 만들어 출력
        System.out.println(obj);                                    // 객체 출력
    }

    public static void main(String[] args) {
        Point p = new Point(2, 3);          // Point 객체 생성
        print(p);                                   // Point 객체 관련 정보 출력
    }
}
