package ch03.exercise.p_15;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 실습 문제 15
 *
 * 2개의 정수를 입력 받아 곱을 구하는 프로그램
 * 실수를 입력하면 오류메세지 출력함
 */
public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성
        while (true) {
            System.out.print("곱하고자 하는 두 수 입력 >> ");
            try {
                int n = input.nextInt();
                int m = input.nextInt();
                System.out.print(n + "x" + m + "=" + n * m);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                input.nextLine();                           // 버퍼비우기
            }
        }
        input.close();
    }
}
