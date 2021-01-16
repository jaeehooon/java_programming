package ch03.exercise.p_6;
import java.util.Scanner;

/**
 * 실습 문제 6
 *
 * 사용자로부터 정수형 숫자(돈)를 입력받고, 해당 돈을 단위마다 몇 개로 변환되는지 출력하는 프로그램
 */
public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};        // 환산할 돈의 종류
        System.out.print("금액을 입력하시오 >> ");
        int money = input.nextInt();                    // 사용자로부터 돈 입력
        for (int i=0; i< unit.length; i++) {
            int count = (money/unit[i]);                // 환산한 갯수
            money %= unit[i];                           // 환산한 후 나머지 금액

            if (count != 0)                             // 갯수가 0이 아니라면
                System.out.println(unit[i] + "원 짜리 : " + count + "개");  // 단위와 갯수 출력

        }
        input.close();              // Scanner 객체 닫기
    }
}
