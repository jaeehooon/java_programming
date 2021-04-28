package ch08.example.ex_8_1;
import java.io.*;

/**
 * 예제 8-1 | FileReader로 텍스트 파일 읽기
 *
 * 현재 "java_programming"으로 work space가 지정되어 있기 때문에
 * 텍스트 파일의 위치를 java_programming 아래로 지정
 */
public class FileReaderEx {
    // 필드

    // 생성자

    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("src/inputs/temp.txt");               // 문자 입력 스트림 생성
            int c;
            while ((c = fin.read()) != -1) {                                    // 한 문자씩 파일 끝까지 읽기
                System.out.print((char)c);
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
