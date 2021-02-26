package ch06.exercise.p_2;

class Circle {
    // 필드
    private int x, y;           // x, y좌표
    private int radius;         // 반지름

    // 생성자
    public Circle() {}          // 기본 생성자
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * 두 원의 중심점이 같은지 판별하는 메소드
     *
     * @param c     Circle 객체
     * @return      두 중심점이 같으면 true,
     *              다르면 false 를 반환
     */
    public boolean equals(Circle c) {
        if (this.x == c.x && this.y == c.y)
            return true;
        return false;
    }
    /**
     * 현재 객체를 문자열로 표현하는 메소드
     */
    public String toString() {
        return "Circle (" + this.x + ", " + this.y + ") 반지름" + this.radius;
    }
}
