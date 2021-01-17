package ch03.exercise.p_12;

/**
 * 실습 문제 12
 *
 * Add.java.를 작성하고 터미널에서 Add.classs 파일을 실행
 * 정수만을 골라 합을 구함
 */
public class Add {
    public static void main(String[] args) {
        int sum = 0;                    // 합계
        for(String s : args) {
            try {
                int i = Integer.parseInt(s);                // 문자열 -> 정수형 변환
                sum += i;                                   // 변환된 정수를 더함
            }
            catch (NumberFormatException e) {
                continue;
            }
        }

        System.out.println(sum);                // 합계 출력
    }
}
