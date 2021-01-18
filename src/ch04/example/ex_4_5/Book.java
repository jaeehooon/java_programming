package ch04.example.ex_4_5;

/**
 * 예제 4-5 | this()로 다른 생성자 호출
 */
public class Book {
    // 필드
    String title;               // 책 제목
    String author;              // 책 저자

    /**
     * 제목과 저자를 출력하는 메소드
     */
    void show() {
        System.out.println(title + " " + author);
    }

    // 생성자
    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book(String title) {
        this(title, "작자미상");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }

}
