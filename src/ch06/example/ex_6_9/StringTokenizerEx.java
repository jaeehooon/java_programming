package ch06.example.ex_6_9;
import java.util.StringTokenizer;

/**
 * 예제 6-9 | StringTokenizer 클래스 메소드 활용
 */
public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍렬/콩쥐/팥쥐", "/");               // 구분자로 '/' 사용

        while(st.hasMoreTokens())                       // 토큰이 있는 동안
            System.out.println(st.nextToken());
    }
}
