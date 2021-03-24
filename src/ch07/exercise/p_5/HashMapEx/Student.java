package ch07.exercise.p_5.HashMapEx;

/**
 * 학생을 가리키는 Student 클래스
 */
class Student {
    // 필드
    private String name;                // 이름
    private String department;          // 학과
    private int id;                     // 학번
    private double gradeAvg;            // 학점 평균

    // 생성자
    public Student() {}                 // 기본 생성자
    public Student(String name, String department, int id, double gradeAvg) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.gradeAvg = gradeAvg;
    }

    /**
     * 멤버 변수의 Getter 메소드
     */
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    public double getGradeAvg() {
        return gradeAvg;
    }

    /**
     * 학생 정보를 출력하는 메소드
     */
    void printStudentInfo() {
        System.out.println(this.name + ", " + this.department + ", " + this.id + ", " + this.gradeAvg);
    }
}
