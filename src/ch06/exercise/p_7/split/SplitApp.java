package ch06.exercise.p_7.split;
import java.util.Scanner;

/**
 * 실습문제 7 (2)
 *
 * Scanner를 사용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어있는지
 * 그만을 입력할 때까지 반복하는 프로그램
 *
 * split() 메소드를 활용
 */
public class SplitApp {
    // 필드
    static Scanner scan;                // Scanner 객체 레퍼런스

    //  생성자

    public static void main(String[] args) {
        scan = new Scanner(System.in);                            // Scanner 객체 생성

        while (true) {
            System.out.print(">> ");
            String input = scan.nextLine();                       // 입력된 문장
            if (input.equals("그만")) {
                System.out.println("종료합니다....");
                break;
            }

            String [] s = input.split(" ");                  // 문자열 split
            System.out.println("어절 개수는 " + s.length);
       }
    }
}
