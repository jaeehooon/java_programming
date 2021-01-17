package ch03.exercise.p_11;

/**
 * 실습 문제 11
 *
 * Average.java를 작성하고 Avaerage.class 파일을 실행
 * 인자로는 정수만을 사용한다.
 */
public class Average {
    public static void main(String[] args) {
        int sum = 0;                   // 합계
        for (String arg : args)
            sum += Integer.parseInt(arg);               // 문자열을 Integer형으로 변환하여 더함

        System.out.println(sum/(args.length));
    }
}
