package ch05.example.ex_5_5;

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();               // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적바인딩
    }
}
