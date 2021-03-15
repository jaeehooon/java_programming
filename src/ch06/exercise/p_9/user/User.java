package ch06.exercise.p_9.user;

/**
 * 가위바위보 게임에 참여하는 유저 클래스
 */
public class User {
    // 필드
    private String name;        // 사용자 이름
    private int choice;         // 사용자가 낼 것. 가위(1), 바위(2), 보(3) 중 하나

    // 생성자
    public User() {}            // 기본 생성자

    /**
     * 필드의 Getter, Setter 메소드
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getChoice() {
        return choice;
    }
    public void setChoice(int choice) {
        this.choice = choice;
    }
}
