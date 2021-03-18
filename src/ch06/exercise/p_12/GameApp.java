package ch06.exercise.p_12;
import ch06.exercise.p_12.main.Gambling;

/**
 * 실습문제 10번
 *
 * 갬블링 게임
 * 두 사람이 게임을 진행하고, 각 사람의 이름을 입력받아 Person 클래스의 객체를 생성한다.
 * 3개의 난수가 발생되고, 이 숫자가 모두 같으면 승자가 되는 프로그램
 * 난수의 숫자 범위는 1~3까지
 */
public class GameApp {
    public static void main(String[] args) {
        Gambling game = new Gambling();
        game.run();
    }
}
