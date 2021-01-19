package ch04.exercise.p_5;
import java.util.Scanner;

/**
 * 실습 문제 5
 *
 * Circle 클래스를 활용하여 Circle 객체의 정보를 출력하는 프로그램
 */

/**
 * Circle 클래스
 *
 * 원을 나타냄.
 * 중심 좌표, 반지름, 객체 정보를 출력하는 메소드를 포함한다.
 */
class Circle {
    // 필드
    private double x, y;                // 원의 중심 좌표
    private int radius;                 // 원의 반지름

    // 생성자
    public Circle() {}                  // 기본 생성자
    public Circle(double x, double y, int radius) { // 필드를 초기화하는 생성자
        this.x = x; this.y = y;
        this.radius = radius;
    }

    /**
     * 객체(원) 정보를 출력하는 메소드
     */
    public void show() {
        System.out.println("(" + this.x + ", " + this.y + ")" + this.radius);
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             // Scanner 객체 생성
        Circle []c = new Circle[3];                        // 크기가 3인 Circle 객체 배열 생성
        for(int i=0; i<c.length; i++) {             // 배열의 크기만큼 루프를 돈다.
            System.out.print("x, y, radius >> ");
            double x = input.nextDouble();              // x좌표 입력
            double y = input.nextDouble();              // y좌표 입력
            int radius = input.nextInt();               // 반지름 입력
            c[i] = new Circle(x, y , radius);           // Circle 객체 생성
        }

        for (Circle circle : c)                           // 배열의 크기만큼 루프를 돈다.
            circle.show();                                // 객체 정보 출력

        input.close();                      // Scanner 객체 닫기
    }
}
