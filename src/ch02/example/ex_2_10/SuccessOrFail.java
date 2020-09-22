package ch02.example.ex_2_10;
import java.util.Scanner;

/**
 * 예제 2-10 | if 문 활용
 */
public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하시오 : ");
        int score = scan.nextInt();
        if (score >= 80) {
            System.out.println("축하합니다! 합격입니다.");
        }

        scan.close();
    }
}
