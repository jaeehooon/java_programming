package ch06.exercise.p_6;

class User {
    // 필드
    private String name;                // 유저 이름

    // 생성자
    public User() {}                    // 기본 생성자

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
