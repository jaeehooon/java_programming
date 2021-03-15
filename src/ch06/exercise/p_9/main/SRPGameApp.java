package ch06.exercise.p_9.main;
import ch06.exercise.p_9.game.SRP;

/**
 * 실습문제 9번
 *
 * 철수와 컴퓨터의 가위바위보 게임 프로그램
 * 가위바위보는 각각 1, 2, 3에 대응
 */
public class SRPGameApp {
    // 필드

    // 생성자
    public SRPGameApp() {}      // 기본 생성자

    public static void main(String[] args) {
        SRP game = new SRP();
        game.run();
    }
}
