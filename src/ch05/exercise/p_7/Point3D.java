package ch05.exercise.p_7;

/**
 * Point 클래스를 상속받아 3차원의 점을 나타내는 Point3D 클래스
 */
public class Point3D extends Point {
    // 필드
    private int z;              // z 좌표

    // 생성자
    public Point3D() {}     // 기본 생성자
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * z 축 방향으로 1칸 위쪽으로 이동하는 메소드
     */
    void moveUp() {
        this.z++;
    }

    /**
     * z 축 방향으로 1칸 아래쪽으로 이동하는 메소드
     */
    void moveDown() {
        this.z--;
    }

    /**
     * x, y, z 축으로 이동하는 메소드
     *
     * @param x     x 좌표
     * @param y     y 좌표
     * @param z     z 좌표
     */
    void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    /**
     * Point3D 객체를 표현하는 메소드
     */
    public String toString() {
        return ("(" + getX() + ", " + getY() + ", " + this.z + ")의 점");
    }

    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);           // 1, 2, 3은 각각 x, y, z축의 값
        System.out.println(p.toString() + "입니다.");

        p.moveUp();                                         // z 축으로 위쪽 이동
        System.out.println(p.toString() + "입니다.");

        p.moveDown();                                         // z 축으로 아래쪽 이동
        p.move(10, 10);                                 // x, y 축으로 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);          // x, y, z 축으로 이동
        System.out.println(p.toString() + "입니다.");
    }

}
