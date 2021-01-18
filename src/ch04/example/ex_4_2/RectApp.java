package ch04.example.ex_4_2;
import java.util.Scanner;

/**
 * 예제 4-2 | Rectangle 클래스 만들기 연습
 */
class Rectangle {
    // 필드
    int width;              // Rectangle 객체의 가로 길이
    int height;             // Rectangle 객체의 세로 길이

    /**
     * 사각형의 면적을 구하는 메소드
     *
     * @return      사각형의 면적
     */
    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();           // 객체 생성
        Scanner input = new Scanner(System.in);     // Scanner 객체 생성
        System.out.print(">> ");
        rect.width = input.nextInt();               // 가로길이 입력
        rect.height = input.nextInt();              // 세로길이 입력
        System.out.println("사각형의 면적은 " + rect.getArea());       // 사각형의 면적 출력

        input.close();                              // Scanner 객체 닫기
    }
}
