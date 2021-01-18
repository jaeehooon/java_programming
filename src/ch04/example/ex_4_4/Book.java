package ch04.example.ex_4_4;

/**
 * 예제 4-4 | 생성자 선언 및 활용 연습
 */
public class Book {
    // 필드
    String title;               // 책 제목
    String author;              // 책 저자

    // 생성자
    public Book(String t) {
        title = t;
        author = "작자미상";
    }
    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");      // 생성자 Book(String t, String a) 호출
        Book loveStory = new Book("춘향전");                           // 생성자 Book(String t) 호출
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
