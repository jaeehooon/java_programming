package ch03.exercise.p_10;

/**
 * 실습 문제 10
 *
 * 4x4의 2차원 배열을 만들고
 * 1~10 범위의 정수를 랜덤하게 10개 생성 후 배열에 삽입한다.
 * 나머지 6개는 0으로 채우고 이 배열을 출력하는 메소드
 */
public class Print2DArray2 {
    public static void main(String[] args) {
        int[][] matrix2 = new int[4][4];       // 2차원 배열 생성
        int cnt = 0;

        // 배열 생성
        while (true) {
            int i = (int)(Math.random() * 4);   // 행 인덱스 랜덤 생성
            int j = (int)(Math.random() * 4);   // 열 인덱스 랜덤 생성

            if (matrix2[i][j] != 0)            // 위의 인덱스의 값이 0이 아니면
                continue;

            matrix2[i][j] = (int)(Math.random() * 10 + 1);       // 랜덤한 숫자 생성
            cnt++;
            if (cnt == 10)          // 10개의 숫자가 생성되면
                break;              // while문 종료
        }

        // 배열 출력
        printArray(matrix2);
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
