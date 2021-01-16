package ch03.example.ex_3_4;

/**
 * 예제 3-4 | 2중 중첩을 이용한 구구단 출력
 */
public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {           // 1단에서 9단까지
            for(int j=1; j<10; j++) {       // 각 단의 구구단 출력
                System.out.print(i + "*" + j + "=" + i*j);      // 구구단 출력
                System.out.print("\t");         // 하나씩 탭으로 띄기
            }
            System.out.println();       // 한 단이 끝나면 다음 줄로 커서 이동
        }
    }
}
