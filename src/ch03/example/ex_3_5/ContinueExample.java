package ch03.example.ex_3_5;
import java.util.Scanner;

/**
 * 예제 3-5 | continue 문을 이용하여 양수 합 구하기
 */
public class ContinueExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요.");
        int sum=0;
        for(int i=0; i<5; i++) {
            int n = scan.nextInt();         // 키보드에서 정수 입력
            if(n<=0)
                continue;       // 양수가 아니면 다음 반복으로 진행
            else
                sum += n;       // 양수이면 덧셈한다.
        }

        System.out.println("양수의 합은 " + sum);
        scan.close();
    }
}
