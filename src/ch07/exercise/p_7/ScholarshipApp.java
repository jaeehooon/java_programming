package ch07.exercise.p_7;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

/**
 * 실습문제 7번
 *
 * 이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고
 * 장학생 선발기준을 입력받아 장학생 명단을 출력하는 프로그램
 */
public class ScholarshipApp {
    // 필드
    Scanner scan;                       // Scanner 객체 레퍼런스
    HashMap<String, Student> hm;        // 해시맵 객체 레퍼런스

    // 생성자
    public ScholarshipApp() {
        scan = new Scanner(System.in);          // Scanner 객체 레퍼런스
        hm = new HashMap<String, Student>();    // 해시맵 객체 생성
    }

    /**
     * 장학금 선발 프로그램을 실행하는 프로그램
     */
    void run() {
        insert();
        find();
    }

    /**
     * 학생 이름과 학점을 입력하는 메소드
     */
    void insert() {
        System.out.println("미래 장학금 관리 시스템입니다.");
        while (hm.size() < 5) {
            System.out.print("이름과 학점 >> ");
            String name = scan.next();                  // 이름 입력
            double grade = scan.nextDouble();           // 학점 입력
            hm.put(name, new Student(name, grade));
            scan.nextLine();                            // 버퍼비우기
        }
    }

    /**
     * 장학금 선발 학점 기준에 맞는 학생을 찾아 이를 출력하는 메소드
     */
    void find() {
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        double bar = scan.nextDouble();                 // 기준 입력
        Vector<String> names = find(bar);               // 기준에 해당하는 이름을 반환
        printNames(names);                              // 해당하는 이름을 출력
        scan.close();
    }

    /**
     * 현재 저장되어 있는 해시맵의 객체 중
     * 기준(bar)학점에 맞는 학생을 Vector 컬렉션에 담아 반환하는 메소드
     *
     * @param bar   학점 기준
     * @return      기준에 충족하는 학생 이름을 담은 Vector 컬렉션 객체
     */
    private Vector<String> find(double bar) {
        Set<String> keys = hm.keySet();                 // 해시맵에 있는 모든 key를 Set 컬렉션으로 리턴
        Vector<String> names = new Vector<String>();    // 장학생 기준에 맞는 학생 이름을 담을 Vector 컬렉션 생성

        for(String key: keys) {
            Student std = hm.get(key);                  // key(이름)에 해당하는 Student 객체 가져오기
            if (std.getGrade() >= bar)                  // 해당 객체(Student)의 학점이 기준(bar)에 맞으면
                names.add(std.getName());               // Vector 컬렉션에 추가
        }
        return names;
    }

    /**
     * 장학금 기준에 충족하는 학생의 이름을 출력하는 메소드
     *
     * @param names     학생 이름이 담긴 Vector 컬렉션 객체
     */
    private void printNames(Vector<String> names) {
        System.out.print("장학생 명단 : ");
        for(String name: names)
            System.out.print(name + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ScholarshipApp app = new ScholarshipApp();
        app.run();
    }
}
