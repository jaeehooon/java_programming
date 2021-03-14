package ch06.exercise.p_8;
import java.util.Scanner;

/**
 * 실습문제 8번
 *
 * 문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램
 */
public class StringRotateApp {
    // 필드
    static Scanner input;               // Scanner 객체 레퍼런스

    // 생성자
    public StringRotateApp() {}         // 기본 생성자

    /**
     * 사용자로부터 입력 받은 문자열을 인자로 해서
     * 한 글자씩 회전시켜 출력하는 메소드
     *
     * @param s     문자열
     */
    static void rotatePrint(String s) {
        int len = s.length();
        for(int i = 1; i < len + 1; i++)
            System.out.println(s.substring(i) + s.substring(0, i));
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);     // Scanner 객체 생성
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");

        String s = input.nextLine();        // 문자열 입력
        rotatePrint(s);                     // 회전하여 출력하는 메소드 호출
    }
}
