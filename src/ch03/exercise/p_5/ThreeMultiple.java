package ch03.exercise.p_5;
import java.util.Scanner;

/**
 * 실습 문제 5
 *
 * 양의 정수를 10개 입력받아 배열에 저장하고,
 * 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램
 */
public class ThreeMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Scanner 객체 생성

        System.out.print("양의 정수 10개를 입력하시오 >> ");
        int[] intArray = new int[10];               // 크기가 10인 int 타입 배열 생성
        for (int i=0; i < intArray.length; i++)     // 배열의 크기만큼 루프를 돈다.
            intArray[i] = input.nextInt();          // 배열에 숫자 대입

        System.out.print("3의 배수는 ");
        for (int i=0; i < intArray.length; i++)         // 배열의 크기만큼 루프를 돈다.
            if (intArray[i] % 3 == 0)                   // 배열의 원소가 3의 배수이면
                System.out.print(intArray[i] + " ");    // 해당 원소를 출력

        input.close();
    }
}
