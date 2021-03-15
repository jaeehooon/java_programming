package ch06.exercise.p_9.game;
import ch06.exercise.p_9.user.User;
import java.util.Scanner;

public class SRP {
    // 필드
    protected User user;                            // 가위바위보 게임 참여자
    String[] srp = {"가위", "바위", "보"};             // 가위바위보 배열
    Scanner input;                                  // Scanner 객체 레퍼런스

    // 생성자
    public SRP() {                                  // 기본 생성자
        user = new User();                          // User 객체 생성
        user.setName("철수");                        // User 객체에 이름 설정
        input = new Scanner(System.in);             // Scanner 객체 생성
    }

    /**
     * 가위바위보 게임을 실행하는 메소드
     */
    public void run() {
        while (true) {
            showMenu(user);
            int choice = input.nextInt();
            if (choice == 4)
                break;
            user.setChoice(choice);
            printResult(user);
        }
    }

    /**
     * 사용자가 선택할 메뉴를 출력하는 메소드
     *
     * @param user      사용자 객체
     */
    void showMenu(User user) {
        System.out.print(user.getName() + "[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
    }

    /**
     * 게임 결과를 출력하는 메소드
     * 사용자 낸 결과와 컴퓨터가 낸 결과를 비교한다.
     * 가위바위보 배열(src)에 인덱스로 접근할 때
     * 사용자 입장에서는 1, 2, 3 이고, 배열 접근은 0, 1, 2로 하므로 -1 해줌
     *
     * @param user      사용자 객체
     */
    void printResult(User user) {
        int com = (int)(Math.random() * 3 + 1);
        System.out.println(user.getName() + "(" + srp[user.getChoice() - 1] + ") : 컴퓨터(" + srp[com - 1] + ")");

        // 사용자가 이기는 경우
        if (com == 1 && user.getChoice() == 2 ||
                com == 2 && user.getChoice() == 3 ||
                    com == 3 && user.getChoice() == 1)
            System.out.println(user.getName() + "가(이) 이겼습니다.");

        // 컴퓨터가 이기는 경우
        else if (com == 1 && user.getChoice() == 3 ||
                    com == 2 && user.getChoice() == 1 ||
                        com == 3 && user.getChoice() == 2)
            System.out.println("컴퓨터가 이겼습니다.");

        // 비기는 경우
        else
            System.out.println("비겼습니다.");
    }
}
