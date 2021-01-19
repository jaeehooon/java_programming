package ch04.exercise.p_8;

/**
 * 실습 문제 8
 *
 * 이름, 전화번호 필드와 생성자를 가진 Phone 클래스를 가지고
 * 검색 기능을 하는 PhoneBook 프로그램
 */

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();             // PhoneBook 객체 생성
        pb.run();                                   // 전화번호부 프로그램 실행
    }
}
