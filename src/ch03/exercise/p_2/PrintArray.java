package ch03.exercise.p_2;

/**
 * 실습 문제 2번
 *
 * 2차원 배열 n을 출력하는 프로그램
 */
public class PrintArray {
    public static void main(String[] args) {
        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};            // 2차원 배열 초기화

        for (int i=0; i<n.length; i++) {
            for (int j = 0; j < n[i].length; j++)
                System.out.print(n[i][j] + " ");
            System.out.println();
        }
    }
}
