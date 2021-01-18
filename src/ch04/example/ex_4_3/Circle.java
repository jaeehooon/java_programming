package ch04.example.ex_4_3;

/**
 * 예제 4-3 | 두 개의 생성자를 가진 Circle 클래스
 */
public class Circle {
    // 필드
    int radius;         // 원의 반지름
    String name;        // 원의 이름

    // 생성자
    public Circle() {       // 매개변수 없는 생성자
        radius = 1; name = "";      // 필드 초기화
    }
    public Circle(int r, String n) {    // 매개변수를 가진 생성자
        radius = r; name = n;       // 매개변수로 필드 초기화
    }

    /**
     * 원의 면적을 구하는 메소드
     *
     * @return  원의 면적
     */
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");      // 객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();            // 객체 생성. 반지름을 1, 이름을 ""으로 초기화.
        donut.name = "도넛피자";                    // 이름변경
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
