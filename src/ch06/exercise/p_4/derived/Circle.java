package ch06.exercise.p_4.derived;
import ch06.exercise.p_4.base.*;

/**
 * Shape 클래스를 상속받은 Circle 클래스
 */
public class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
