package ch02.exercise;
import java.util.Scanner;

/**
 * 실습 문제 6번
 *
 * 1 ~ 99 사이의 정수를 입력받고,
 * 3, 6, 9 중 하나가 있는 경우 "박수짝", 두개 있는 경우는 "박수짝짝"을 출력하는 프로그램
 */
public class Clap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        int number = input.nextInt();           // 정수 입력받음
        printClap(count(number));

        input.close();
    }

    /**
     * 사용자로부터 입력받은 숫자에 3, 6, 9가 몇 개 포함되어 있는지 판별하는 메소드.
     *
     * @param number    2자리 정수
     * @return          포함되어 있는 갯수
     */
    public static int count(int number) {
        int cnt = 0;
        int temp_1 = number / 10;          // 십의 자리
        int temp_2 = number % 10;          // 일의 자리

        if (temp_1 == 3 || temp_1 == 6 || temp_1 == 9)
            cnt += 1;
        if (temp_2 == 3 || temp_2 == 6 || temp_2 == 9)
            cnt += 1;

        return  cnt;
    }
    /**
     *
     * 포함되어 있는 갯수에 따라 "박수짝", "박수짝짝" 중 하나를 출력한다.
     *
     * @param count       3, 6, 9 포함 개수
     */
    public static void printClap(int count) {
        if (count == 1)
            System.out.println("박수짝");
        else if (count == 2)
            System.out.println("박수짝짝");
    }
}
