package ch08.example.ex_8_4;
import java.io.*;
import java.util.*;

/**
 * 예제 8-4 | 키보드 입력을 파일로 저장하기
 */
public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("temp3.txt");
            while (true) {
                String line = scan.nextLine();              // 빈칸을 포함하여 한 줄 읽기
                if (line.length() == 0)                     // 한 줄에 <Enter>키만 입력된 경우
                    break;
                fout.write(line, 0, line.length());     // 읽은 문자열을 파일에 저장
                fout.write("\r\n", 0, 2);       // 한 줄 띄기 위해 \r\n을 파일에 저장
            }
            fout.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }

        scan.close();
    }
}
