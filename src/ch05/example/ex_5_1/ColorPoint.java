package ch05.example.ex_5_1;

/**
 * Point 클래스를 상속받고, 점의 색깔을 표현하는 필드가 추가된 ColorPoint 클래스
 */
class ColorPoint extends Point {
    // 필드
    private String color;           // 점의 색깔

    /**
     * color의 setter 메소드
     */
    public void setColor(String color) {
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
