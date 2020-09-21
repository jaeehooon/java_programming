package ch02;
import java.util.Scanner;

/**
 * 예제 2-11 | if-else 활용
 */
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수를 입력하시오 : ");
        int number = scan.nextInt();       // 정수를 입력받는다.
        if (number % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }

        scan.close();
    }
}
