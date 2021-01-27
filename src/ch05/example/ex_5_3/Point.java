package ch05.example.ex_5_3;

/**
 * 하나의 점을 구성하는 클래스
 * x, y 좌표로 이루어져 있음
 */
class Point {
    // 필드
    private int x, y;           // 한 점을 구성하는 x, y 좌표

    // 생성자
    public Point(int x, int y) {
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
