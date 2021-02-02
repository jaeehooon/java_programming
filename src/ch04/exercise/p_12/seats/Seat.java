package ch04.exercise.p_12.seats;
import ch04.exercise.p_12.user.Person;

public class Seat {
    // 필드
    private Person p;               // 예약한 사람 객체
    private boolean isEmpty;        // 좌석이 비어있는지 아닌지 가리키는 변수

    // 생성자
    public Seat() {                 // 기본 생성자
        p = new Person("___");          // Person 객체 생성
        isEmpty = true;
    }

    /**
     * Seat 클래스 필드의 getter, setter 메소드
     */
    public Person getP() {
        return p;
    }
    public void setP(Person p) {
        this.p = p;
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
