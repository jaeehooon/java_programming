package ch07.exercise.p_2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * 실습문제 2번
 *
 * Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'E', 'F')을 문자로 입력받아
 * ArrayList에 저장하고 검색하여 학점을 점수로 변환하여 평균을 출력하는 프로그램
 */
public class ArrayListTest {
    // 필드
    Scanner input;                      // Scanner 객체 레퍼런스

    // 생성자
    public ArrayListTest() {}           // 기본 생성자

    /**
     * 점수 변환 및 평균 점수 출력 프로그램 실행
     */
    void run() {
        System.out.print("6개의 학점을 빈칸으로 분리 입력(A/B/C/D/E/F) >> ");
        input = new Scanner(System.in);                                     // Scanner 객체 생성
        ArrayList<Character> arrList = new ArrayList<Character>();          // ArrayList 객체생성
        while (arrList.size() < 6) {                                       // 6개를 담기 전까지 while문 진행
            char ch = (input.next()).charAt(0);                             // 학점을 하나씩 입력
            arrList.add(ch);                                                // ArrayList에 추가
        }
        printAvg(arrList);                      // ArrayList에 담긴 학점을 점수로 변환하여 평균을 출력
        input.close();                          // Scanner 객체 닫기
    }

    /**
     * ArrayList를 인자로 받아
     * List 안에 저장된 학점의 평균을 출력하는 메소드
     *
     * @param charArrList       Character형 학점을 담은 ArrayList
     */
    void printAvg(ArrayList<Character> charArrList) {
        double sum = 0.0;
        for(char grade: charArrList)
            sum += gradeToScore(grade);
        System.out.println(sum / charArrList.size());
    }

    /**
     * 학점을 점수로 변환하는 메소드
     *
     * @param grade     학점
     * @return          학점 등급에 따른 점수 반환
     */
    private double gradeToScore(char grade) {
        double score = 0.0;
        switch (grade) {
            case 'A':
                score = 4.0;
                break;
            case 'B':
                score = 3.0;
                break;
            case 'C':
                score = 2.0;
                break;
            case 'D':
                score = 1.0;
                break;
            case 'F':
                score = 0.0;
                break;
            default:
                score = -1.0;
        }
        return score;
    }

    public static void main(String[] args) {
        ArrayListTest test = new ArrayListTest();
        test.run();
    }
}
