package ch05.exercise.p_7;

class Point {
    // 필드
    private int x, y;               // x, y 좌표

    // 생성자
    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 멤버 변수를 반환하는 Getter 메소드
     */
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    /**
     * 좌표를 이동하는 메소드
     *
     * @param x     이동할 x 좌표
     * @param y     이동할 y 좌표
     */
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
