package ch04.example.ex_4_10;

/**
 * 예제 4-10 | 멤버의 접근 지정자
 */
class Sample {
    // 필드
    public int a;
    private int b;
    int c;          // 디폴트 접근 지정
}

public class AccessEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
//        sample.b = 10;            // 접근 불가능
        sample.c = 10;
    }
}
