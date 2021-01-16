package ch03.exercise.p_3;
import java.util.Scanner;

/**
 * 실습 문제 3
 *
 * 정수를 입력받고 *를 출력하는 프로그램
 *
 */
public class PrintAsters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);              // Scanner 객체 생성
        System.out.print("정수를 입력하세요 >> ");
        int num = scan.nextInt();                           // 사용자로부터 정수 입력받음

        for(int i=0; i<num; i++) {
            for(int j=0; j<num-i; j++)
                System.out.print("*");
            System.out.println();
        }

        scan.close();                   // Scanner 객체 닫기
    }
}
