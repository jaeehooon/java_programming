package ch06.example.ex_6_4;

/**
 * 예제 6-4 | Rect 클래스와 equals() 만들기 연습
 */

class Rect {
    // 필드
    int width;
    int height;

    // 생성자
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 사각형 면적을 비교하는 메소드
     *
     * @param obj       비교할 객체
     * @return          사각형 면적이 같으면 true,
     *                  면적이 다르면 false 반환
     */
    public boolean equals(Object obj) {
        Rect p = (Rect)obj;             // ojb를 Rect로 다운 캐스팅
        if (this.width * this.height == p.width * p.height)
            return true;
        else
            return false;
    }
}

public class RectEqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        if (a.equals(b))
            System.out.println("a is equal to b");
        if (a.equals(c))
            System.out.println("a is equal to c");
        if (b.equals(c))
            System.out.println("b is equal to c");
    }
}
