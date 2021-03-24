package ch07.exercise.p_5.ArrayListEx;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 실습문제 5번 (1)
 *
 * 4명의 학생정보를 저장하고 검색 기능을 하는 프로그램
 * ArrayList 이용
 */
public class StudentApp {
    // 필드
    ArrayList<Student> stdList;                 // Student 클래스를 담는 ArrayList 객체 레퍼런스
    Scanner scan;                               // Scanner 객체 레퍼런스

    // 생성자
    public StudentApp() {                       // 기본 생성자
        scan = new Scanner(System.in);          // Scanner 객체 생성
        stdList = new ArrayList<Student>();     // Student 클래스를 담는 ArrayList 객체 생성
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

        while (stdList.size() < 4) {                                    // 4명의 학생 정보를 받음
            System.out.print(">> ");
            String info = scan.nextLine();
            String[] infoArr = info.split(",");                             // 학생 정보를 입력받고 컴마(,)를 기준으로 문자열을 분리
            stdList.add(new Student(infoArr[0].trim(), infoArr[1].trim(), Integer.parseInt(infoArr[2].trim()), Double.parseDouble(infoArr[3].trim())));
        }
    }

    /**
     * ArrayList 내에 있는 Student 객체의 정보를 출력하는 메소드
     */
    void printAllInfo() {
        for (Student student : stdList) {
            System.out.println("---------------------------------");
            System.out.print("이름: ");
            System.out.println(student.getName());
            System.out.print("학과: ");
            System.out.println(student.getDepartment());
            System.out.print("학번: ");
            System.out.println(student.getId());
            System.out.print("학점평균: ");
            System.out.println(student.getGradeAvg());
        }
        System.out.println("---------------------------------");
    }

    /**
     * 학생 1명의 정보를 출력하는 메소드
     *
     * @param name      학생 이름
     */
    void printInfo(String name) {
        for(Student std: stdList)
            if (std.getName().equals(name)) {               // 인자로 받은 학생 이름과 동일한 객체가 있으면 해당 학생 객체의 정보를 출력
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
    }

    public static void main(String[] args) {
        StudentApp app = new StudentApp();
        app.run();
    }
}
