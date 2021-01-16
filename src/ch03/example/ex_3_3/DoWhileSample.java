package ch03.example.ex_3_3;

/**
 * 예제 3-3 | a부터 z까지 출력
 */
public class DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';

        do {
            System.out.print(c);
            c = (char) (c + 1);             // 영문의 경우 1을 더하면 다음 문자의 코드 값
        } while (c <= 'z');
    }
}
