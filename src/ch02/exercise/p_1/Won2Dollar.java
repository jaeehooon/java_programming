package ch02.exercise.p_1;
import java.util.Scanner;

/**
 * 실습 문제 1
 *
 * 사용자로부터 원화를 입력받고 달러로 바꾸는 클래스
 * $1 = 1100원
 */
public class Won2Dollar {
    // 필드
    public static final int RATE = 1100;                // 환율

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        System.out.print("원화를 입력하세요(단위 원) >> ");
        int won = input.nextInt();              // 원화 입력
        System.out.println(won + "원은 $" + convert(won) + "입니다.");

        input.close();
    }

    /**
     * '원화'를 달러로 변환하는 메소드
     *
     * @param won       원화
     */
    public static double convert(double won) {
        return won / RATE;
    }
}
