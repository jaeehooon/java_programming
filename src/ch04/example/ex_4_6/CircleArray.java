package ch04.example.ex_4_6;

/**
 * 예제 4-6 | Circle 객체 배열 만들기
 */
class Circle {
    // 필드
    int radius;         // 원의 반지름

    // 생성자
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * 원의 면적을 구하는 메소드
     *
     * @return  원의 면적
     */
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
public class CircleArray {
    public static void main(String[] args) {
        Circle [] c;                // Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle[5];          // 5개의 레퍼런스 배열 생성

        for(int i=0; i<c.length; i++)       // 배열의 갯수만큼 루프를 돈다.
            c[i] = new Circle(i);           // i 번째 원소 객체 생성

        for(int i=0; i<c.length; i++)       // 배열의 갯수만큼 루프를 돈다.
            System.out.print((int)(c[i].getArea()) + " ");      // Circle객체의 면적 출력
    }
}
