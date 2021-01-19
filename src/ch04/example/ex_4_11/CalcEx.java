package ch04.example.ex_4_11;

/**
 * 예제 4-11 | static 멤버를 가진 Calc 클래스 작성
 */
class Calc {
    /**
     * 인자로 받은 값(정수)의 절대값을 반환하는 메소드
     *
     * @param a     정수형 숫자
     * @return      절댓값을 씌운 값으로 반환
     */
    public static int abs(int a) {
        return a>0?a:-a;
    }

    /**
     * 인자로 받은 두 숫자 중 큰 수를 반환하는 메소드
     *
     * @param a     정수형 숫자
     * @param b     정수형 숫자
     * @return      더 큰 수를 반환
     */
    public static int max(int a, int b) {
        return (a>b)?a:b;
    }

    /**
     * 인자로 받은 두 숫자 중 더 작은 수를 반환하는 메소드
     *
     * @param a     정수형 숫자
     * @param b     정수형 숫자
     * @return      더 작은 수를 반환
     */
    public static int min(int a, int b) {
        return (a>b)?b:a;
    }
}

public class CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}
