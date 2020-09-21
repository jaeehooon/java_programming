package ch02.exercise;
import java.util.Scanner;

/**
 * 실습 문제 7번
 *
 * 사용자로부터 정수 x, y값을 입력받고 주어진 사각형안에 (x, y) 좌표가 있는지 판별하는 프로그램
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             // Scanner 객체 생성
        System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
        int x = input.nextInt();        // x 좌표 입력
        int y = input.nextInt();        // y 좌표 입력

        if (inRect(x, y))
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
        else
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 없습니다.");

        input.close();
    }

    /**
     * 사용자로부터 입력받은 (x, y)좌표가
     * (100, 100) ~ (200, 200)으로 이루어진 사각형 안에 있는지 판별하는 메소드
     *
     * @param x     x 좌표
     * @param y     y 좌표
     * @return      주어진 사각형 안에 있으면 true, 없으면 false 반환
     */
    public static boolean inRect(int x, int y) {
        return ((x >= 100 && x <= 200) && (y >= 100 && y <= 200));
    }


}
