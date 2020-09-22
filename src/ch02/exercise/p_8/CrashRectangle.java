package ch02.exercise.p_8;
import java.util.Scanner;

/**
 * 실습 문제 8번
 *
 * 사용자로부터 두 점을 입력받아 주어진 사각형과 충돌하는지 판별하는 프로그램
 */
public class CrashRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성

        System.out.print("점 (x1, y1)의 좌표를 입력하시오 >> ");      // 점 (x1, y1)의 좌표를 입력받음
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("점 (x2, y2)의 좌표를 입력하시오 >> ");      // 점 (x2, y2)의 좌표를 입력받음
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (inRect(x1, y1, 100, 100, 200, 200) ||
                inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("두 직사각형은 충돌합니다.");
        else
            System.out.println("두 직사각형은 충돌하지 않습니다.");

        input.close();
    }

    /**
     * 사용자가 입력한 두 점으로 이루어진 사각형과 주어진 사각형이 충돌하는지 판별하는 메소드
     * @param x         x 좌표
     * @param y         y 좌표
     * @param rectx1    사각형의 왼쪽 상단 모서리 x 좌표
     * @param recty1    사각형의 왼쪽 상단 모서리 y 좌표
     * @param rectx2    사각형의 오른쪽 하단 모서리 x 좌표
     * @param recty2    사각형의 오른쪽 하단 모서리 y 좌표
     * @return
     */
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        return ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2));
    }
}
