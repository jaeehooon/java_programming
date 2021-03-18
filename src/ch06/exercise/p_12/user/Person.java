package ch06.exercise.p_12.user;

/**
 * 갬블링 게임을 참여하는 사람을 나타내는 Person 클래스
 */
public class Person {
    // 필드
    private String name;        // 사용자 이름

    // 생성자
    public Person() {}            // 기본 생성자

    /**
     * 필드의 Getter, Setter 메소드
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
