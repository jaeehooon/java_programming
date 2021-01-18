package ch04.example.ex_4_1;

/**
 * ㅇㅖ제 4-1 | Circle 클래스의 객체 생성 및 활용
 */
public class Circle {
    // 필드
    int radius;         // 원의 반지름
    String name;        // 원의 이름

    // 생성자
    public Circle() {}

    /**
     * 원의 면적을 계산하는 메소드
     *
     * @return 원의 면적
     */
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza;                       // 레퍼런스 변수 pizza 선언
        pizza = new Circle();               // Circle 객체 생성
        pizza.radius = 10;                  // 피자의 반지름을 10으로 설정
        pizza.name = "자바피자";               // 피자의 이름 설정
        double area = pizza.getArea();      // 피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();        // Circle 객체 생성
        donut.radius = 2;                   // 도넛의 반지름을 2로 설정
        donut.name = "자바도넛";               // 도넛의 이름 설정
        area = donut.getArea();             // 도넛의 면적 알아내기
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
