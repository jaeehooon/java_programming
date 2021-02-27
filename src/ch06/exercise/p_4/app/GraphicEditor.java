package ch06.exercise.p_4.app;

import ch06.exercise.p_4.base.Shape;
import ch06.exercise.p_4.derived.Circle;

/**
 * 실습문제 4번
 *
 * 각 패키지에 맞게 클래스를 분리하여 작성한 프로그램
 */
public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
