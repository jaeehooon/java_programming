package ch05.example.ex_5_3;

/**
 * Point 클래스를 상속받고, 점의 색깔을 표현하는 필드가 추가된 ColorPoint 클래스
 */
class ColorPoint extends Point {
    // 필드
    private String color;           // 점의 색깔

    // 생성자
    public ColorPoint(int x, int y, String color) {
        super(x, y);                // Point의 생성자 Point(x, y) 호출
        this.color = color;
    }

    /**
     * 점의 색깔과 좌표를 출력하는 메소드
     */
    public void showColorPoint() {
        System.out.print(color);
        showPoint();            // Point 클래스의 showPoint() 호출
    }

}
