package ch05.exercise.p_12;

/**
 * 도형(shape)을 가리키는 클래스
 * 여러 도형을 연결하는 링크드 리스트 역할을 하는 멤버를 포함한다.
 */
public abstract class Shape {
    // 필드
    private Shape next;          // 다음 Shape 를 가리키는 멤버

    // 생성자
    public Shape() {
        next = null;
    }

    /**
     * 링크 연결을 하는 메소드
     *
     * @param obj   Shape 클래스를 상속받은 클래스
     */
    public void setNext(Shape obj) {
        next = obj;
    }

    /**
     * 다음 도형을 반환하는 메소드
     *
     * @return      링크에 연결된 도형(Shape) 클래스 객체
     */
    public Shape getNext() {
        return next;
    }

    /**
     * 본 클래스를 그리는 역할을 하는 추상 메소드
     */
    public abstract void draw();
}

/**
 * Shape 클래스를 상속받아 선(Line)을 나타내는 클래스
 */
class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

/**
 * Shape 클래스를 상속받아 직사각형(Rect)을 나타내는 클래스
 */
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

/**
 * Shape 클래스를 상속받아 Circle(Circle)을 나타내는 클래스
 */
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
