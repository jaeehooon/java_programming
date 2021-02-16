package ch05.exercise.p_2;

/**
 * TV 클래스를 상속받아 ColorTV 를 나타내는 클래스
 *
 * 속성을 출력하는 메소드와 이를 출력하는 main메소드를 포함한다.
 */
public class ColorTV extends TV {
    // 필드
    private int color;              // 컬러

    // 생성자
    public ColorTV(int size) {
        super(size);
    }
    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    /**
     * Getter Color 메소드
     */
    public int getColor() {
        return color;
    }

    /**
     * ColorTV 객체의 속성을 출력하는 메소드
     */
    void printProperty() {
        System.out.println(getSize() + "인치 " + this.color + "컬러");
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
