package ch03.example.ex_3_17;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 예제 3-17 | 입력 오류 시 발생하는 예외(InputMismatchException)
 */
public class InputException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          // Scanner 객체 생성
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;
        for(int i=0; i<3; i++) {
            System.out.print(i + ">> ");
            try {
                n = scan.nextInt();         // 정수 입력
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scan.next();            // 현재 입력 스트림에 남아 있는 토큰을 지운다.
                i--;                    // 인덱스가 증가하지 않도록 미리 감소
                continue;               // 다음 루프
            }
            sum += n;                   // 더하기
        }
        System.out.println("합은 " + sum);
        scan.close();
    }
}
