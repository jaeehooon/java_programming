package ch04.exercise.p_10;
import java.util.Scanner;

/**
 * 실습 문제 10
 *
 * Dictionary 클래스를 활용한 한영 단어 검색 프로그램
 */

/**
 * 사전 역할을 하는 클래스
 *
 * 한글 단어와 영어 단어를 담은 두 개의 배열을 갖고 있고,
 * 뜻이 대응되는 대로 인덱스에 위치해 있다.
 */
class Dictionary {
    // 필드
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};                 // Dictionary에 저장된 한글 단어
    private static String[] eng = {"love", "baby", "money", "future", "hope"};      // Dictionary에 저장된 영어 단어
    Scanner input;                  // Scanner 객체 레퍼런스

    // 생성자
    public Dictionary() { }                    // 기본 생성자

    /**
     * 한글을 입력하면 영어 단어 뜻을 검색하는 메소드
     *
     * @param word  검색할 단어
     * @return      검색할 단어가 있으면 해당 영어단어를 반환
     */
    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length; i++)
            if (kor[i].equals(word))            // 찾는 단어가 사전에 존재하면
                return eng[i];                  // 해당 영어단어 반환
        return null;
    }

    /**
     * Dictionary를 실행하는 메소드
     */
    public void run() {
        input = new Scanner(System.in);         // Scanner 객체 생성
        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true) {
            System.out.print("한글 단어? ");
            String word = input.nextLine();         // 한글 단어입력
            if (word.equals("그만")) {
                finish();
                break;
            }
            String result = kor2Eng(word);          // 영어 단어 검색
            if (result != null)
                System.out.println(word + "은(는) " + result);
            else
                System.out.println(word + "는 저의 사전에 없습니다.");
        }
    }

    /**
     * 프로그램을 종료하는 메소드
     */
    public void finish() {
        input.close();              // Scanner 객체 닫기
        System.exit(0);         // 프로그램 종료
    }
}

public class DicApp {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();             // Dictionary 객체 생성
        dict.run();                                     // DictApp 프로그램 실행
    }
}
