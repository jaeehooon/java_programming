package ch02.exercise.p_9;
import java.util.Scanner;

/**
 * 실습 문제 9번
 *
 * 사용자로부터 원의 중심과 반지름을 실수 값으로 입력받고,
 * 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하는 프로그램
 */
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        System.out.print("원의 중심과 반지름 입력 >> ");
        int centerX = input.nextInt();
        int centerY = input.nextInt();
        double radius = input.nextDouble();

        System.out.print("점 입력 >> ");
        int x = input.nextInt();
        int y = input.nextInt();

        if(inCircle(x, y, centerX, centerY, radius))
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        else
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없다.");
        input.close();
    }

    /**
     * 점 (x, y)가 원의 내부에 있는지 판별하는 메소드
     *
     * @param x         x 좌표
     * @param y         y 좌표
     * @param centerX   원의 중심 x 좌표
     * @param centerY   원의 중심 y 좌표
     * @param radius    원의 반지름
     * @return          (x, y)가 원에 내부에 있으면 true, 없으면 false 반환
     */
    public static boolean inCircle(int x, int y, int centerX, int centerY, double radius) {
        return ((x - centerX)*(x - centerX) + (y - centerY)*(y - centerY) <= radius*radius);
    }


}
