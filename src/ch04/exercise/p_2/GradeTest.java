package ch04.exercise.p_2;
import java.util.Scanner;

/**
 * 실습 문제 2
 *
 * 3과목의 점수를 입력 받아 성적의 평균을 출력하는 프로그램
 */

class Grade {
    // 필드
    private int math;               // 수학 점수
    private int science;            // 과학 점수
    private int eng;                // 영어 점수

    // 생성자
    public Grade() {}               // 기본 생성자
    public Grade(int math, int science, int eng) {
        this.math = math;
        this.science = science;
        this.eng = eng;
    }

    /**
     * 해당 객체의 점수 평균을 구하는 메소드
     *
     * @return      3과목의 평균 점수. int형으로 반환한다.
     */
    int average() {
        return (this.math + this.science + this.eng) / 3;
    }

}
public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             // Scanner 객체 생성
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
        int math = input.nextInt();             // 수학 점수 입력
        int science = input.nextInt();          // 과학 점수 입력
        int eng = input.nextInt();              // 영어 점수 입력
        Grade me = new Grade(math, science, eng);               // Grade 객체 생성
        System.out.println("평균은 " + me.average());              // average()는 평균을 계산하여 리턴

        input.close();                      // Scanner 객체 닫기
    }
}
