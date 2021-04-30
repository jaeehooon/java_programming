package ch08.example.ex_8_10;
import ch08.example.ex_8_5.FileOutputStreamEx;

import java.io.*;

/**
 * 예제 8-10 | 바이너리 파일 복사
 */
public class BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File("src/inputs/image1.jpg");           // 원본 파일 경로명
        File dest = new File("src/outputs/castleCopyImage1.jpg");     // 복사 파일 경로명

        int c;
        try {
            FileInputStream fi = new FileInputStream(src);              // 파일 입력 바이트 스트림 생성
            FileOutputStream fo = new FileOutputStream(dest);           // 파일 출력 바이트 스트림 생성

            while ((c = fi.read()) != -1) {             // 파일을 끝까지 읽는다.
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        }
        catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
