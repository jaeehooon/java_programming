package ch08.example.ex_8_7;
import java.io.*;
import java.util.Scanner;

/**
 * 예제 8-7 | 버퍼 스트림을 이용한 출력
 */
public class BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("src/inputTexts/test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
            while ((c = fin.read()) != -1) {                // 파일 데이터를 모두 스크린에  출력
                out.write(c);
            }

            // 파일 데이터가 모두 출력된 상태
            new Scanner(System.in).nextLine();              // <Enter> 키 입력
            out.flush();                                    // 버퍼에 남아 있던 문자 모두 출력
            fin.close();
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
