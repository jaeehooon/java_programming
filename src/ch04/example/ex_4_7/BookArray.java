package ch04.example.ex_4_7;
import java.util.Scanner;

/**
 * 예제 4-7 | 객체 배열 만들기 연습
 */
class Book {
    // 필드
    String title;               // 책 제목
    String author;              // 책 저자

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[2];          // Book 객체 배열 생성

        Scanner input = new Scanner(System.in);             // Scanner 객체 생성
        for(int i=0; i<book.length; i++) {                  // 배열의 크기만큼 루프를 돈다.
            System.out.print("제목 >> ");
            String title = input.nextLine();                // 책 제목 입력
            System.out.print("저자 >> ");
            String author = input.nextLine();               // 책 저자 입력
            book[i] = new Book(title, author);              // 배열 원소 객체 생성
        }

        for(int i=0; i<book.length; i++)                    // 배열의 크기만큼 루프를 돈다.
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");        // 입력한 값들을 출력

        input.close();                      // Scanner 객체 닫기
    }
}
