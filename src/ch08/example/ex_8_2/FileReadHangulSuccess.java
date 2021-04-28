package ch08.example.ex_8_2;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 예제 8-2 | InputStreamReader로 한글 텍스트 파일 읽기
 *
 * 현재 "java_programming"으로 work space가 지정되어 있기 때문에
 * 텍스트 파일의 위치를 java_programming 아래로 지정
 */
public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/inputs/temp2.txt");
            in = new InputStreamReader(fin, StandardCharsets.UTF_8);               // 올바른 문자 집합 지정
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());           // 문자 집합 이름 리턴
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
