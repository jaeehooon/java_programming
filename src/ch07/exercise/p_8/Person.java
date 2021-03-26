package ch07.exercise.p_8;

/**
 * 사람을 가리키는 Person 클래스
 */
class Person {
    // 필드
    private String name;                // 이름

    // 생성자
    public Person() {}                  // 기본 생성자
    public Person(String name) {
        this.name = name;
    }

    /**
     * 멤버변수의 Getter 메소드
     */
    public String getName() {
        return this.name;
    }
}

/**
 * Person 클래스를 상속받고, 고객을 나타내는 Customer 클래스
 * 현재 고객의 포인트 점수를 가져오거나 지정하는 Getter, Setter 메소드를 포함한다. *
 */
class Customer extends Person {
    // 필드
    private int pointScore;                             // 포인트 점수

    // 생성자
    public Customer() {}                                // 기본 생성자
    public Customer(String name, int pointScore) {
        super(name);
        this.pointScore = pointScore;
    }

    /**
     * 멤버변수의 Getter, Setter 메소드
     */
    public int getPointScore() {
        return this.pointScore;
    }
    public void setPointScore(int pointScore) {
        this.pointScore = pointScore;
    }
}
