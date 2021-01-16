package ch03.exercise.p_7;

/**
 * 실습 문제 7
 *
 * 1 ~ 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하고,
 * 이들 숫자들과 평균을 출력하는 프로그램
 */
public class AvgOfRandomNumber {
    public static void main(String[] args) {
        int [] numbers = new int[10];           // 배열 생성
        double sum = 0.0;                         // 총합을 나타내는 변수

        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1);       // 난수 생성
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for(int i=0; i< numbers.length; i++)
            sum += numbers[i];                              // 배열에 저장된 난수를 더함

        System.out.println("평균은 " + sum/ numbers.length);   // 평균을 출력
    }
}
