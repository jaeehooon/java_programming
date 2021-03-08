package ch06.exercise.p_6;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 실습 문제 6번
 *
 * 경과 시간을 맞추는 게임
 * <Enter>키를 입력하면 현재 시간의 '초'를 출력하고,
 * 다음 10초 경과 후를 예측하여 <Enter>키를 입력하여 더 근접하게 맞추는 사람이 이기는 게임
 */
public class GameApp {
    // 필드
    Calendar cal;               // Calendar 객체 레퍼런스
    Scanner scan;               // Scanner 객체 레퍼런스
    User user1, user2;          // User 객체 레퍼런스

    // 생성자
    public GameApp(User user1, User user2) {                // 기본 생성자
        this.user1 = user1;
        this.user2 = user2;
    }

    /**
     * 게임을 실행하는 메소드
     */
    public void run() {
        scan = new Scanner(System.in);                  // Scanner 객체 생성

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1 = play(this.user1);
        int result2 = play(this.user2);

        System.out.print(this.user1.getName() + "의 결과 " + result1 + " "
                + this.user2.getName() + "의 결과 " + result2 + ", 승자는 ");
        if (Math.abs(result1 - 10) < Math.abs(result2 - 10))
            System.out.println(this.user1.getName());
        else if (Math.abs(result1 - 10) > Math.abs(result2 - 10))
            System.out.println(this.user2.getName());
        else
            System.out.println("없습니다.");
    }

    /**
     * 유저 1명당 1회의 게임을 실행하는 메소드
     *
     * @param user      User 객체
     * @return          게임 실행 결과. 경과 시간을 반환
     */
    public int play(User user) {
        System.out.print(user.getName() + "시작 <Enter>키 >> ");
        scan.nextLine();
        cal = Calendar.getInstance();
        int min1 = cal.get(Calendar.SECOND);                // 현재 초 시간 얻기
        System.out.println("\t현재 초 시간 = " + min1);
        System.out.print("10초 예상 후 <Enter>키 >> ");
        scan.nextLine();
        cal = Calendar.getInstance();
        int min2 = cal.get(Calendar.SECOND);                // 현재 초 시간 얻기
        System.out.println("\t현재 초 시간 = " + min2);

        if (min2 <= min1)
            min2 += 60;
        return (min2 - min1);
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("황기태");
        User user2 = new User();
        user2.setName("이재문");

        GameApp game = new GameApp(user1, user2);           // GameApp 객체 생성
        game.run();
    }
}
