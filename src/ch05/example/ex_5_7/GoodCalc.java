package ch05.example.ex_5_7;

/**
 * 예제 5-7 | 추상 클래스의 구현 연습
 *
 * 추상 클래스 Calculator를 상속받아 계산기를 역할을 하는 클래스
 */
public class GoodCalc extends Calculator {

    @Override
    public int add(int a, int b) {      // 추상 메소드 구현
        return a + b;
    }

    @Override
    public int subtract(int a, int b) { // 추상 메소드 구현
        return a - b;
    }

    @Override
    public double average(int[] a) {    // 추상 메소드 구현
        double sum = 0;
        for (int i=0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();        // GoodCalc 객체 생성
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] {2, 3, 4}));
    }
}
