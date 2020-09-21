package ch02.exercise;
import java.util.Scanner;

/**
 * 실습 문제 3
 *
 * 정수로 된 돈의 액수를 입력받고,
 * 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각각 몇 개로 변환되는지 출력하는 프로그램
 */
public class Exchanger {
    // 필드
    public static final int[] units = {50000, 10000, 1000, 100, 50, 10, 1};       // 화폐 단위

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("금액을 입력하시오 >> ");
        int money = input.nextInt();          // 금액 입력

        for (int unit : units) {
            printCount(money, unit);
            money %= unit;
        }


        input.close();
    }

    /**
     * 화폐 단위마다 몇 개가 있는지 출력하는 메소드
     *
     * @param money        금액
     */
    public static void printCount(int money, int unit) {
        int temp = (money / unit);          // 화폐 단위가 몇 개(장) 있는지
        switch (unit) {
            case 50000:
                System.out.println("오만원권 " + temp + "매");
                break;
            case 10000:
                System.out.println("만원권 " + temp + "매");
                break;
            case 1000:
                System.out.println("천원권 " + temp + "매");
                break;
            case 100:
                System.out.println("백원 " + temp + "개");
                break;
            case 50:
                System.out.println("오십원 " + temp + "개");
                break;
            case 10:
                System.out.println("십원 " + temp + "개");
                break;
            case 1:
                System.out.println("일원 " + temp + "개");
                break;
        }
    }
}
