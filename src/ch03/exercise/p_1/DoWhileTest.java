package ch03.exercise.p_1;

/**
 * 실습 문제 1 (4)
 *
 *
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int sum=0, i=0;
        do {
            sum += i;
            i += 2;
        } while (i < 100);

        System.out.println(sum);
    }
}
