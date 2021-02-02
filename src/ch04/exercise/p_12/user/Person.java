package ch04.exercise.p_12.user;

public class Person {
    // 필드
    private String name;            // 사람의 이름

    // 생성자
    public Person() {}              // 기본 생성자
    public Person(String name) {
        this.name = name;
    }

    /**
     * name의 Getter, Setter 메소드
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
