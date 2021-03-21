package ch07.exercise.p_1;
import java.util.InputMismatchException;
import java.util.Vector;
import java.util.Scanner;

/**
 * 실습 문제 1번
 *
 * 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램
 */
public class VectorEx {
    // 필드
    static final int INF = 999999999;

    /**
     * Integer 타입의 Vector 클래스의 객체의 요소 중 가장 큰 요소의 값을 반환하는 메소드
     *
     * @param v     Integer 타입의 Vector 객체
     * @return      가장 큰 요소
     */
    static int maxValue(Vector<Integer> v) {
        int max = -INF;
        for(int i=0; i<v.size(); i++) {
            int val = v.get(i);
            if (val >= max)
                max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수(-1이 입력될 때까지) >> ");
        Vector<Integer> v = new Vector<Integer>();          // Vector 객체 생성
        int input;
        while (true) {
            try {
                input = scan.nextInt();
                if (input == -1)                                // 입력한 수가 -1이면 입력 종료
                    break;
                v.add(input);                                   // 입력한 요소 추가
            }
            catch (InputMismatchException e) {                  // 입력한 수가 정수가 아닐 때의 예외 처리
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scan.nextLine();                                // 버퍼 비우기
            }
        }
        System.out.println(maxValue(v));                    // 입력한 수 중 가장 큰 수 출력
        scan.close();
    }
}
