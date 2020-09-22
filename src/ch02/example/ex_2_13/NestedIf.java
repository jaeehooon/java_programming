package ch02.example.ex_2_13;
import java.util.Scanner;

/**
 * 예제 2-13 | 중첩 if-else 문 사례
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scan.nextInt();     // 점수 읽기
        System.out.print("학년을 입력하세요(1~4) : ");
        int year = scan.nextInt();      // 학년 읽기

        if (score >= 60) {
            if (year != 4)
                System.out.println("합격!");      // 4학년이 아니면 합격
            else if (score >= 70)
                System.out.println("합격!");      // 4학년이 70점 이상이면 합격
            else
                System.out.println("불합격!");     // 4학년이 70점 미만이면 불합격
        }
        else        // 60점 미만이면
            System.out.println("불합격!");

        scan.close();
    }
}
