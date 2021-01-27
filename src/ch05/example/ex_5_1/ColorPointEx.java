package ch05.example.ex_5_1;

/**
 * 예제 5-1 | 클래스 상속 만들기 - Point와 ColorPoint 클래스
 */
public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();          // Point 객체 생성
        p.set(1, 2);                    // Point 클래스의 set() ghcnf
        p.showPoint();

        ColorPoint cp = new ColorPoint();       // ColorPoint 객체 생성
        cp.set(3, 4);                           // Point 클래스의 set() 호출
        cp.setColor("red");                     // ColorPoint 클래스의 setColor() 호출
        cp.showColorPoint();                    // 컬러와 좌표 출력
    }
}
