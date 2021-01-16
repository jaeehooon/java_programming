package ch03.example.ex_3_6;
import java.util.Scanner;

/**
 * 예제 3-6 | break 문을 이용하여 while 문 벗어나기
 */
public class BreakExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");
        while(true) {
            System.out.print(">> ");
            String text = scan.nextLine();          // 한 라인 읽기
            if (text.equals("exit"))                // "exit"이 입력되면
                break;                              // 반복문 종료.
        }
        System.out.println("종료합니다....");
        scan.close();
    }
}
