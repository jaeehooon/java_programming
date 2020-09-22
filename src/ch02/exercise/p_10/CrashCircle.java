package ch02.exercise.p_10;
import java.util.Scanner;

/**
 * 실습 문제 10번
 *
 * 두 원의 정보(중심, 반지름)을 입력 받고 두 원이 서로 겹치는지 판별하는 프로그램
 */
public class CrashCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     // Scanner 객체 생성

        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");              // 첫번째 원 정보 입력받음
        int centerX1 = input.nextInt();
        int centerY1 = input.nextInt();
        int radius1 = input.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력 >> ");              // 두번쨰 원 정보 입력받음
        int centerX2 = input.nextInt();
        int centerY2 = input.nextInt();
        int radius2 = input.nextInt();

        if (isCrash(centerX1, centerY1, radius1, centerX2, centerY2, radius2))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");

        input.close();
    }

    /**
     * 두 원이 서로 겹치는지 판별하는 메소드
     * 두 원의 중심 사이 거리가 두 원의 반지름의 합보다 짧다면 두 원은 겹친다.
     *
     * @param centerX1      원1의 x 좌표
     * @param centerY1      원1의 y 좌표
     * @param radius1       원1의 반지름
     * @param centerX2      원2의 x 좌표
     * @param centerY2      원2의 y 좌표
     * @param radius2       원2의 반지름
     */
    public static boolean isCrash(int centerX1, int centerY1, int radius1, int centerX2, int centerY2, int radius2) {
        return (Math.sqrt((centerX1 - centerX2)*(centerX1 - centerX2) + (centerY1 - centerY2)*(centerY1 - centerY2)) <= (radius1 + radius2));
    }
}
