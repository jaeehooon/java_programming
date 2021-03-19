package ch07.example.ex_7_7;
import java.util.*;

/**
 * 예제 7-7 | HashMap에 객체 저장, 학생 정보 관리
 */

/**
 * 학생을 가리키는 Student 클래스
 */
class Student {
    // 필드
    private int id;         // 학번
    private String tel;     // 전화번호

    // 생성자
    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    /**
     * 필드의 Getter 메소드
     */
    public int getId() {
        return id;
    }
    public String getTel() {
        return tel;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        // (학생 이름, Student 객체)를 저장하는 해시맵 생성
        HashMap<String, Student> map = new HashMap<String, Student>();

        // 3명의 학생 저장
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));

        Scanner scan = new Scanner(System.in);          // Scanner 객체 생성
        while(true) {
            System.out.print("검색할 이름? ");
            String name = scan.nextLine();              // 사용자로부터 이름 입력
            if (name.equals("exit"))
                break;                  // while문을 벗어나 프로그램 종료
            Student student = map.get(name);            // 이름에 해당하는 Student 객체 검색
            if (student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id: " + student.getId() + ", 전화: " + student.getTel());
        }

        scan.close();                                   // Scanner 객체 닫기
    }
}
