package ch04.exercise.p_3;

/**
 * 실습 문제 3
 *
 * 노래 한곡을 나타내는 Song 클래스를 활용하여
 * 1978년, 스웨덴국적의 ABBA가 부른 Dancing Queen 정보를 출력하는 프로그램
 */

/**
 * 노래 한 곡을 나타내는 Song 클래스
 */
class Song {
    // 필드
    private String title;           // 노래 제목
    private String artist;          // 가수 이름
    private int year;               // 발표 연도
    private String country;         // 국적

    // 생성자
    public Song() {}       // 기본 생성자
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    /**
     * 노래 정보를 출력하는 메소드
     */
    void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
    }
}

public class SongTest {
    public static void main(String[] args) {
        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");     // Song 객체 생성
        song.show();                // 객체의 정보 출력
    }
}
