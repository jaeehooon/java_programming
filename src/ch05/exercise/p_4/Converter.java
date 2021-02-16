package ch05.exercise.p_4;
import java.util.Scanner;

/**
 * 단위를 변환하는 Converter 클래스
 *
 * 사용자로부터 변환되기 전의 값을 입력받고, 이를 변환해주는 메소드를 포함한다.
 */
abstract class Converter {
    abstract protected double convert(double src);          // 추상 메소드
    abstract protected String getSrcString();               // 추상 메소드
    abstract protected String getDestString();              // 추상 메소드
    protected double ratio;                                 // 비율

    public void run() {
        Scanner scan = new Scanner(System.in);             // Scanner 객체 생성
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요 >> ");
        double val = scan.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
        scan.close();
    }
}
