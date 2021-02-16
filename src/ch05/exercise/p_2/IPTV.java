package ch05.exercise.p_2;

/**
 * ColorTV 클래스를 상속받아 IPTV를 나타내는 클래스
 *
 * IP주소와 크기, 컬러를 인자로 받아 객체를 생성한다.
 */
public class IPTV extends ColorTV {
    // 필드
    private String address;             // IP 주소

    // 생성자
    public IPTV(String address, int size, int color) {
        super(size, color);
        this.address = address;
    }

    @Override
    void printProperty() {
        System.out.println("나의 IPTV는 " + this.address + " 주소의 " + this.getSize() + "인치 " + this.getColor() + "컬러");
    }
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);            // "192.1.1.2" 주소에 32인치, 2048 컬러

        iptv.printProperty();
    }
}
