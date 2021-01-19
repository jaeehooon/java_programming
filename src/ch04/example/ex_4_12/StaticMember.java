package ch04.example.ex_4_12;
import java.util.Scanner;

/**
 * 예제 4-12 | static을 이용한 환율 계산기
 */
class CurrencyConverter {
    // 필드
    private static double rate;         // 1$에 대한 원화

    /**
     * 원화를 달러로 변환하는 메소드
     *
     * @param won       원화
     * @return          달러로 변환된 금액
     */
    public static double toDollar(double won) {
        return won / rate;
    }

    /**
     * 달러를 원화로 변환하는 메소드
     *
     * @param dollar        달러 금액
     * @return              원화로 변환된 금액
     */
    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    /**
     * 환율을 설정하는 메소드
     * 원/$1
     *
     * @param r     환율
     */
    public static void setRate(double r) {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성
        System.out.print("환율(1달러) >> ");
        double rate = input.nextDouble();               // 환율 입력
        CurrencyConverter.setRate(rate);                // 미국 달러 환율 설정
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "입니다.");
        input.close();                                  // Scanner 객체 닫기
    }
}
