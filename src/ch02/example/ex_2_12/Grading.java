package ch02.example.ex_2_12;
import java.util.Scanner;

/**
 * 예제 2-12 | 다중 if-else로 학점 매기기
 */
public class Grading {
    public static void main(String[] args) {
        char grade;
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100) : ");
        int score = scan.nextInt();        // 점수 정수로 읽기
        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("학점은 " + grade + "입니다.");
        scan.close();
    }
}
