package ch07.exercise.p_5.HashMapEx;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

/**
 * 실습문제 5번 (2)
 *
 * 4명의 학생정보를 저장하고 검색 기능을 하는 프로그램
 * HashMap 이용
 */
public class StudentApp {
    // 필드
    Scanner scan;                                       // Scanner 객체 레퍼런스
    HashMap<String, Student> stdHashMap;                // 학생 이름을 key로 하고 해당 학생 객체를 value로 갖는 hashmap 객체 레퍼런스

    // 생성자
    public StudentApp() {                               // 기본 생성자
        stdHashMap = new HashMap<String, Student>();    // HashMap 객체 생성
        scan = new Scanner(System.in);                  // Scanner 객체 생성
    }

    /**
     * 프로그램을 실행시키는 메소드
     */
    void run() {
        inputInfo();
        printAllInfo();
        search();
    }

    /**
     * ArrayList 내에 Student 객체를 저장하는 메소드
     */
    void inputInfo() {
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");

        while (stdHashMap.size() < 4) {                                    // 4명의 학생 정보를 받음
            System.out.print(">> ");
            String info = scan.nextLine();
            String[] infoArr = info.split(",");                             // 학생 정보를 입력받고 컴마(,)를 기준으로 문자열을 분리

            // HaspMap 컬렉션에 Student 객체 저장
            stdHashMap.put(infoArr[0].trim(), new Student(infoArr[0].trim(), infoArr[1].trim(), Integer.parseInt(infoArr[2].trim()), Double.parseDouble(infoArr[3].trim())));
        }
    }

    /**
     * ArrayList 내에 있는 Student 객체의 정보를 출력하는 메소드
     */
    void printAllInfo() {

        Set<String> keys = stdHashMap.keySet();             // 해시맵에 있는 모든 key를 Set 컬렉션으로 리턴
        for (String key : keys) {
            System.out.println("---------------------------------");
            System.out.print("이름: ");
            System.out.println(stdHashMap.get(key).getName());
            System.out.print("학과: ");
            System.out.println(stdHashMap.get(key).getDepartment());
            System.out.print("학번: ");
            System.out.println(stdHashMap.get(key).getId());
            System.out.print("학점평균: ");
            System.out.println(stdHashMap.get(key).getGradeAvg());
        }
        System.out.println("---------------------------------");
    }

    /**
     * 학생 1명의 정보를 출력하는 메소드
     *
     * @param name      학생 이름
     */
    void printInfo(String name) {
        Student std = stdHashMap.get(name);
        if (std != null) {
            std.printStudentInfo();
            return;
        }
        System.out.println("해당 학생 정보는 없습니다.");
    }

    /**
     * 학생 이름을 입력받고 학생의 정보를 출력하는 메소드
     */
    void search() {
        while (true) {
            System.out.print("학생 이름 >> ");
            String name = scan.nextLine();              // 검색할 학생 이름 입력
            if (name.equals("그만"))                      // "그만"이 입력되면 검색 종료
                break;
            printInfo(name);                            // "그만"이 아니면 학생 정보 출력
        }
        scan.close();                                   // Scanner 객체 닫기
    }

    public static void main(String[] args) {
        StudentApp app = new StudentApp();
        app.run();
    }
}
