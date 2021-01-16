package ch03.example.ex_3_15;
import java.util.Scanner;

/**
 * 예제 3-15 | 0으로 나눌 때 발생하는 ArithmeticException 예외 처리
 */
public class DivideByZeroHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          // Scanner 객체 생성
        int dividend;       // 나뉨수
        int divisor;        // 나눗수

        while (true) {
            System.out.print("나뉨수를 입력하시오 : ");
            dividend = scan.nextInt();          // 나뉨수 입력
            System.out.print("나눗수를 입력하시오 : ");
            divisor = scan.nextInt();           // 나눗수 입력
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
                break;          // 정상적인 나누기 완료 후 while문 벗어나기
            } catch (ArithmeticException e) {       // ArithmeticException 예외 처리 코드
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }
        scan.close();                   // Scanner 객체 닫기
    }
}
