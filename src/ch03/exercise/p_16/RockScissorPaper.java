package ch03.exercise.p_16;
import java.util.Scanner;

/**
 * 실습 문제 16
 *
 * 컴퓨터와 가위바위보 게임을 하는 프로그램
 *
 */
public class RockScissorPaper {
    // 필드
    public static Scanner scan = null;                      // Scanner 객체
    static String [] str = {"가위", "바위", "보"};             // 가위바위보 배열


    public static void main(String[] args) {
        scan = new Scanner(System.in);                      // Scanner 객체
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보! >> ");
            String input = scan.next();                     // 입력받음
            if (input.equals("그만")) {                      // 사용자가 "그만"을 입력하면
                System.out.println("게임을 종료합니다...");
                break;                                      // 종료
            }

            String com = computerChoice();                  // 컴퓨터가 낸 것
            result(input, com);
        }
        scan.close();                                       // Scanner 객체 닫기
    }

    /**
     * 컴퓨터가 낸 것을 의미하는 메소드.
     * 0, 1, 2 중 하나를 랜덤으로 뽑고,
     * 0: 가위, 1: 바위, 2: 보
     *
     * @return  가위바위보 중 하나를 반환
     */
    public static String computerChoice() {
        return str[(int)(Math.random()*3)];
    }

    /**
     * 게임 결과를 출력하는 메소드
     *
     * @param user      사용자가 낸 것
     * @param computer  컴퓨터가 낸 것
     */
    public static void result(String user, String computer) {
        System.out.print("사용자 = " + user + ", 컴퓨터 = " + computer + ", ");

        if (user.equals(computer))              // 컴퓨터와 사용자가 낸 것이 같다면
            System.out.println("비겼습니다.");
        else {
            // 컴퓨터가 이기는 경우
            if (user.equals("가위") && computer.equals("바위") ||
                    user.equals("바위") && computer.equals("보") ||
                        user.equals("보") && computer.equals("가위"))
                System.out.println("컴퓨터가 이겼습니다.");
            // 사용자가 이기는 경우
            else if (user.equals("가위") && computer.equals("보") ||
                        user.equals("바위") && computer.equals("가위") ||
                            user.equals("보") && computer.equals("바위"))
                System.out.println("사용자가 이겼습니다.");
        }
    }
}

