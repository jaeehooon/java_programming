package ch07.exercise.p_7;

/**
 * 장학생 선발 기준을 위한 학생 정보를 가리키는 Student 클래스
 */
class Student {
    // 필드
    private String name;            // 이름
    private double grade;           // 학점

    // 생성자
    public Student() {}             // 기본 생성자
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * 멤버변수의 Getter 메소드
     */
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
}
