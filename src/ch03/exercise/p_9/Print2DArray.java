package ch03.exercise.p_9;

/**
 * 실습 문제 9
 *
 * 4x4의 2차원 배열을 만들고 1~10까지 범위의 정수를 랜덤하게 저장하고
 * 이를 출력하는 프로그램
 */
public class Print2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];       // 2차원 배열 생성

        // 배열 생성
        for(int i=0; i < matrix.length; i++)
            for (int j=0; j < matrix[0].length; j++)
                matrix[i][j] = (int)(Math.random() * 10 + 1);       // 랜덤한 숫자 생성

        // 배열 출력
        printArray(matrix);
    }

    /**
     * 2차원 배열을 출력하는 메소드
     *
     * @param array     2차원 배열
     */
    public static void printArray(int[][] array) {
        for(int i=0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }
}
