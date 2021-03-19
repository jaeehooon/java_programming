package ch07.example.ex_7_2;
import java.util.Vector;

/**
 * 예제 7-2 | Point 클래스만 다루는 Vector<Point> 컬렉션 활용
 */

/**
 * 좌표를 가리키는 Point 클래스
 */
class Point {
    // 필드
    private int x, y;               // x, y 좌표

    // 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Point 객체를 문자열로 표현하는 메소드
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();              // Point 객체를 요소로 다루는 벡터 생성

        // 3개의 Point 객체 삽입
        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));

        v.remove(1);                        // 인덱스 1의 Point(-5, 20) 객체 삭제

        // 벡터에 있는 Point 객체 모두 검색하여 출력
        for(int i=0; i<v.size(); i++) {
            Point p = v.get(i);             // 벡터의 i번째 Point 객체 얻어내기
            System.out.println(p);          // p.toString()을 이용하여 객체 p 출력
        }
    }

}
