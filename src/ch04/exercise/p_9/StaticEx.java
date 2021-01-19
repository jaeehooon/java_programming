package ch04.exercise.p_9;

/**
 * 실습 문제 9
 *
 * ArrayUtil 클래스를 활용하여 두 개의 배열을 연결해주는 프로그램
 */

/**
 * 배열을 다루는 클래스
 * 
 * 두 개의 배열을 연결하는 메소드와 배열을 출력하는 메소드를 포함한다.
 */
class ArrayUtil {

    /**
     * 두 개의 배열을 이어주는 메소드
     *
     * @param a     배열 a
     * @param b     배열 b
     * @return      두 개의 배열을 연결하여 새로운 배열 반환
     */
    public static int[] concat(int[] a, int[] b) {
        int [] newArray = new int[a.length + b.length];                // 새로운 배열 생성. 배열의 크기는 인자로 받은 두 개의 배열 크기의 합
        for(int i=0; i<a.length; i++)                                   // 배열 a의 크기만큼 루프를 돈다.
            newArray[i] = a[i];                                         // 새로운 배열에 기존 배열 a의 원소를 넣는다.
        for(int j=0; j<b.length; j++)                                   // 배열 b의 크기만큼 루프를 돈다.
            newArray[a.length + j] = b[j];                              // 새로운 배열에 기존 배열 b의 원소를 넣는다.

        return newArray;                    // 배열 반환
    }

    /**
     * 인자로 받은 배열을 출력하는 메소드
     *
     * @param a     정수형 배열
     */
    public static void print(int[] a) {
        System.out.print("[ ");
        for(int i: a)
            System.out.print(i + " ");
        System.out.println("]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int [] array1 = {1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
