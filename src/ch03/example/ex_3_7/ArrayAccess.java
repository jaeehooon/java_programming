package ch03.example.ex_3_7;
import java.util.Scanner;

/**
 * 예제 3-7 | 배열에 입력받은 수 중 제일 큰 수 찾기
 */
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intArray[] = new int[5];            // 배열 생성
        int max = 0;                            // 현재 가장 큰 수
        System.out.println("양수 5개를 입력하세요.");
        for(int i=0; i<5; i++) {
            intArray[i] = scan.nextInt();           // 입력받은 정수를 배열에 저장
            if(intArray[i] > max)                   // 입력받은 수가 현재 가장 큰 수 보다 크면
                max = intArray[i];                  // max값 변경
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        scan.close();
    }
}
