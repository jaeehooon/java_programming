package ch07.exercise.p_3;
import ch03.example.ex_3_16.ArrayException;

import java.util.Scanner;
import java.util.HashMap;
/**
 * 실습문제 3번
 *
 * 나라 이름과 인구를 입력받아 저장하고
 * 다시 나라 이름을 입력받아 인구를 출력하는 프로그램
 */
public class HashMapTest {
    // 필드
    Scanner input;                              // Scanner 객체 레퍼런스
    HashMap<String, Integer> nations;           // HashMap 객체 레퍼런스

    // 생성자
    public HashMapTest() {}                     // 기본 생성자

    /**
     * 특정 나라의 인구수를 출력하는 프로그램을 실행하는 메소드
     */
    void run() {
        System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
        input = new Scanner(System.in);                         // Scanner 객체 생성
        nations = new HashMap<String, Integer>();               // HashMap 객체 생성
        insertNations();                                        // 나라 이름과 인구수 입력받기
        printPopluation();                                      // 인구수 검색 시작
    }

    /**
     * "그만"이 입력되거나 해시맵의 크기가 10개일 떄까지 나라 이름과 인구수를 입력받는 메소드
     */
    private void insertNations() {
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            try {
                String inputLine = input.nextLine();
                if (inputLine.equals("그만") || nations.size() > 10)                 // "그만"이 입력되거나 해시맵의 크기가 10보다 커지면 입력 및 저장 종료
                    break;
                String[] _input = inputLine.split(" ");
                nations.put(_input[0], Integer.parseInt(_input[1]));                // 문자열 타입의 인구수를 Integer 형으로 변환하여 해시맵에 추가
            }
            catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {      // 잘못된 명령어 입력에 대한 예외처리
                System.out.println("잘못된 입력입니다! 다시 입력하세요!");
            }
        }
    }

    /**
     * "그만"이 입력되기 전까지 나라 이름을 입력하면
     * 해당 나라가 해시맵에 존재하면 인구수를 출력하는 메소드
     */
    private void printPopluation() {
        while (true) {
            System.out.print("인구 검색 >> ");
            String inputLine = input.nextLine();                // 인구 검색할 나라 입력
            if (inputLine.equals("그만"))                         // 그만이 입력되면 인구 수 출력 종료
                break;

            if (nations.get(inputLine) != null)                 // 만약 해시맵에 있는 키값이라면
                System.out.println(inputLine + "의 인구는 " + nations.get(inputLine));      // 인구수 출력
            else                                                // 그렇지 않다면
                System.out.println(inputLine + "는(은) 없습니다.");                          // 오류 문구 출력
        }
        input.close();
    }

    public static void main(String[] args) {
        HashMapTest hm = new HashMapTest();
        hm.run();
    }
}
