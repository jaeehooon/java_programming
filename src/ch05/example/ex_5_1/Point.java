package ch05.example.ex_5_1;

/**
 * 하나의 점을 구성하는 클래스
 * x, y 좌표로 이루어져 있음
 */
class Point {
    // 필드
    private int x, y;           // 한 점을 구성하는 x, y 좌표

    /**
     * 좌표 x, y의 setter 메소드
     */
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 점의 좌표를 출력하는 메소드
     */
    public void showPoint() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
