package ch02.exercise.p_11;
import java.util.Scanner;

/**
 * 실습 문제 11번
 *
 * 숫자를 입력받아 해당 숫자가 어떤 계절에 속하는지 출력하는 프로그램
 * ex) 3~5 : 봄
 *     6~8 : 여름
 *     9~11: 가을
 *     12~2: 겨울
 */
public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner 객체 생성

        System.out.print("달을 입력하세요(1 ~ 12) >> ");
        int number = input.nextInt();           // 숫자 입력
        printSeason1(number);
        printSeason2(number);

        input.close();
    }

    /**
     * 사용자가 입력한 숫자(달)이 어떤 계절인지 출력하는 메소드
     * if-else 문으로 구현
     *
     * @param number    '달(month)'을 의미하는 정수형 숫자
     */
    public static void printSeason1(int number) {
        if (number >= 3 && number < 6)
            System.out.println("봄");
        else if (number >= 6 && number < 9)
            System.out.println("여름");
        else if (number >= 9 && number < 12)
            System.out.println("가을");
        else if (number == 12 || (number <= 2 && number >= 1))
            System.out.println("겨울");
        else
            System.out.println("잘못된 입력입니다.");
    }


    /**
     * 사용자가 입력한 숫자(달)이 어떤 계절인지 출력하는 메소드
     * switch 문으로 구현
     *
     * @param number    '달(month)'을 의미하는 정수형 숫자
     */
    public static void printSeason2(int number) {
        switch (number) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
