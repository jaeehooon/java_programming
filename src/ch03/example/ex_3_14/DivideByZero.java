package ch03.example.ex_3_14;
import java.util.Scanner;

/**
 * 예제 3-14 | 0으로 나누기 예외 발생으로 프로그램이 강제 종료되는 경우
 */
public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          // Scanner 객체 생성
        int dividend;       // 나뉨수
        int divisor;        // 나눗수

        System.out.print("나뉨수를 입력하시오 : ");
        dividend = scan.nextInt();          // 나뉨수 입력
        System.out.print("나눗수를 입력하시오 : ");
        divisor = scan.nextInt();           // 나눗수 입력
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
        scan.close();                   // Scanner 객체 닫기
    }
}
