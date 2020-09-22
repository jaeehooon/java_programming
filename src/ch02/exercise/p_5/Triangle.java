package ch02.exercise.p_5;
import java.util.Scanner;

/**
 * 실습 문제 5번
 *
 * 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
 * 이 3개의 수로 삼각형을 만들 수 있는지 판별하는 프로그램
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오 >> ");
        int[] numbers = new int[3];                     // int형 배열 생성
        for(int i=0; i < numbers.length; i++)
            numbers[i] = input.nextInt();               // 정수 3개 입력받음

        if(possible(numbers))
            System.out.println("삼각형이 됩니다.");
        else
            System.out.println("삼각형이 되지 못합니다.");

        input.close();
    }

    /**
     * 사용자로부터 입력받은 숫자 3개가 삼각형을 만들수 있는지 판별하는 메소드
     *
     * @param numbers       정수 3개
     * @return              삼각형을 만들 수 있으면 true, 만들지 못하면 false반환
     */
    public static boolean possible(int[] numbers) {
        return (numbers[0] + numbers[1] > numbers[2] ||
                    numbers[1] + numbers[2] > numbers[0] ||
                        numbers[0] + numbers[2] > numbers[1]);
    }
}
