package ch02.exercise.p_2;
import java.util.Scanner;

/**
 * 실습 문제 2
 *
 * 사용자로부터 2자리의 정수를 입력받고, 십의 자리와 일의 자리가 같은지 판별하여 출력하는 프로그램
 */
public class SameDigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             // Scanner 객체 생성

        System.out.print("2자리수 정수 입력(10~99) >> ");
        int number = input.nextInt();                       // 정수 입력

        // 10의 자리와 1의 자리가 같은지 비교
        if (isSameNum(number))
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");

        input.close();
    }

    /**
     * 2자리의 정수의 십의 자리와 일의 자리가 같은지 판별하는 메소드
     *
     * @param number    2자리 정수
     * @return          십의 자리와 일의 자리가 같으면 true를 반환,
     *                  그렇지 않으면 false를 반환
     */
    public static boolean isSameNum(int number) {
        return ((number / 10) == (number % 10));
    }
}
