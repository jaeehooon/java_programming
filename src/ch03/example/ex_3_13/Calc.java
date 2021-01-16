package ch03.example.ex_3_13;

/**
 * 예제 3-13 | main()에서 명령행 인자의 합 계산
 *
 * MacOS IntelliJ 기준으로
 * javac "Class명"을 실행 후, "Class명.class" 파일 생성 유무 확인!
 * 터미널에서 위치를 "src/"로 변경하고 실행함
 * ex) java ch03.example.ex_3_13.Calc 2 20.5 88.1
 */
public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i=0; i<args.length; i++)
            sum += Double.parseDouble(args[i]);         // 문자열을 실수(double 타입)로 변환하여 합산

        System.out.println("sum = " + sum);
    }
}
