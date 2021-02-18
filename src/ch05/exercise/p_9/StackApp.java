package ch05.exercise.p_9;
import java.util.Scanner;

/**
 * 실습문제 9번
 *
 * Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 활용한 프로그램
 *
 */
public class StackApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = input.nextInt();
        StringStack ss = new StringStack(capacity);         // StringStack 객체 생성
        input.nextLine();                                   // 버퍼 비우기
        while (true) {
            System.out.print("문자열 입력 >> ");
            String str = input.nextLine();                  // 문자열 입력
            if (str.equals("그만")) {
                ss.printStack();
                break;
            }
            else if (str.equals("pop")) {
                String popStr = ss.pop();
                if (popStr != null)
                    System.out.println("문자열 " + popStr + " pop 완료!");
                else
                    System.out.println("현재 스택에 저장된 값이 없습니다.");
            }
            else
                ss.push(str);
        }

        input.close();
    }
}
