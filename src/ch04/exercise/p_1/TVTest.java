package ch04.exercise.p_1;

/**
 * 실습 문제 1
 *
 * TV를 나타내는 클래스를 활용하여
 * 객체를 표현하는 프로그램
 */

/**
 * TV를 나타내는 클래스
 */
class TV {
    // 필드
    private String brand;            // 브랜드 이름
    private int year;                // 만들어진 연도
    private int size;                // TV 사이즈

    // 생성자
    public TV() {}                   // 기본 생성자
    public TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.size = size;
    }

    /**
     * TV 정보를 출력하는 메소드
     *
     */
    void show() {
        System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}

public class TVTest {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);           // LG에서 만든 2017년 32인치
        myTV.show();
    }
}
