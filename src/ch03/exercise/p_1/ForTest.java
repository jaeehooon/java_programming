package ch03.exercise.p_1;

/**
 * 실습 문제 1 (3)
 *
 *
 */
public class ForTest {
    public static void main(String[] args) {
        int sum=0, i=0;
        for(i=0; i<100; i+=2) {
            sum += i;
        }

        System.out.println(sum);
    }
}
