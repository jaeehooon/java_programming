package ch08.example.ex_8_3;
import java.io.*;

/**
 * 예제 8-3 | 한글 텍스트 파일 읽기(문자 집합 지정이 잘못된 경우)
 */
public class FileReadHangulFail {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/inputs/temp2.txt");         // 파일로부터 바이트 입력 스트림 생성

            in = new InputStreamReader(fin, "US-ASCII");        // 문자 집합 지정이 잘못된 예를 보이기 위해 일부러 틀린 문자 집합 지정

            int c;
            System.out.println("인코딩 문자 집합은 " + in.getEncoding());       // 문자집합 출력
            while ((c = in.read()) != -1) {     // 문자 단위로 읽는다.
                System.out.print((char)c);
            }
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
