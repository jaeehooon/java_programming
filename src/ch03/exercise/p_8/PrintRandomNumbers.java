package ch03.exercise.p_8;
import java.util.Scanner;

/**
 * 실습 문제 8
 *
 * 정수를 몇 개 저장할지 사용자로부터 입력받고,
 * 1 ~ 100 범위의 정수를 랜덤하게, 중복되지 않게 배열에 삽입하여
 * 출력하는 프로그램
 */
public class PrintRandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성
        System.out.print("정수 몇개? ");
        int num = input.nextInt();                  // 정수 입력
        int[] numbers = new int[num];               // 배열 생성
        int i = 0;
        while (i != num) {                          // 인덱스가 입력한 num과 같지 않으면 while문 진행
            int number = (int)(Math.random()*100 + 1);      // 랜덤한 숫자 생성

            if (existNumber(numbers, number))               // 랜덤하게 생성한 숫자가 이미 존재하면
                continue;                                   // 다시 루프를 돈다.

            numbers[i] = number;                            // 배열에 삽입
            i++;                                            // 인덱스 크기 증가
        }
        printArray(numbers);        // 삽입한 배열 출력

        input.close();              // Scanner 객체 닫기
    }

    /**
     * 배열 내에 특정 숫자가 있는지 체크하는 메소드
     *
     * @param array     배열
     * @param number    체크할 숫자
     * @return          숫자가 존재하면 true,
     *                  존재하지 않으면 false 반환
     */
    public static boolean existNumber(int[] array, int number) {
        for (int j : array)         // 배열의 크기만큼 루프를 돈다.
            if (j == number)        // 배열의 원소가 체크할 숫자와 같으면
                return true;        // true 반환
        return false;
    }

    /**
     * 배열을 출력하는 메소드
     *
     * @param array     int형 배열
     */
    public static void printArray(int[] array) {
        int cnt = 0;
        for(int i : array) {
            System.out.print(i + " ");
            cnt++;
            if (cnt % 10 == 0) {
                cnt = 0;
                System.out.println();
            }
        }
    }
}
