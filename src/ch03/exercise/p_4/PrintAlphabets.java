package ch03.exercise.p_4;
import java.util.Scanner;

/**
 * 실습 문제 4
 *
 * 소문자 알파벳을 하나 입력받고 출력하는 프로그램
 */
public class PrintAlphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String s = input.next();                // 사용자로부터 알파벳 입력받음(문자열 형태)
        char ch = s.charAt(0);                  // 문자열의 첫번쨰 문자

        int diff = ch - 'a';                    // 입력받은 문자와 a와의 차이
        for (int i = 0; i <= diff; i++) {
            for (int j = 0; j <= diff - i; j++)
                System.out.print((char)('a' + j));
            System.out.println();
        }
        input.close();              // Scanner 객체 닫기
    }
}
