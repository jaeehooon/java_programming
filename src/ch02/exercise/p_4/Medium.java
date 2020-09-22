package ch02.exercise.p_4;
import java.util.Scanner;

/**
 * 실습 문제 4번
 *
 * 사용자로부터 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하는 프로그램
 */
public class Medium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        int[] numbers = new int[3];                     // int형 배열 생성
        for(int i=0; i < numbers.length; i++)
            numbers[i] = input.nextInt();               // 숫자 3개 입력받음
        System.out.println("중간 값은 " + getMedium(numbers));

        input.close();
    }

    /**
     * 3개의 숫자 중 중간 크기의 숫자를 반환하는 메소드
     *
     * @param numbers    숫자로 이루어진 배열
     * @return           3개의 숫자 중 중간 크기의 숫자
     */
    public static int getMedium(int[] numbers) {
        if (numbers[0] >= numbers[1] && numbers[2] >= numbers[0])
            return numbers[0];
        else if (numbers[1] >= numbers[2] && numbers[0] >= numbers[1])
            return numbers[1];
        return numbers[2];
    }
}
