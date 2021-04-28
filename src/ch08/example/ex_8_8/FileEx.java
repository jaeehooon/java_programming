package ch08.example.ex_8_8;
import java.io.File;

/**
 * 예제 8-8 | File 클래스 활용한 파일 관리
 */
public class FileEx {
    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");

        File[] subFiles = dir.listFiles();                  // 디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기

        for (File f : subFiles) {            // subFiles 배열의 각 File에 대해 루프
            long t = f.lastModified();                      // 마지막으로 수정된 시간
            System.out.print(f.getName());
            System.out.print("\t파일 크기 : " + f.length());    // 파일 크기
            System.out.printf("\t수정한 시간 : %tb %tb %ta %tT\n", t, t, t, t);      // 포맷 출력
        }
    }

    public static void main(String[] args) {
        File f1 = new File("src");
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

        String res = "";
        if (f1.isFile())                // 파일 타입이면
            res = "파일";
        else if (f1.isDirectory())      // 디렉토리 타입이면
            res = "디렉토리";
        System.out.println(f1.getPath() + "은 " + res + "입니다.\n\n");


        File f2 = new File("src/java_sample");     // 새로 만들고자 하는 디렉토리
        if (!f2.exists()) {             // f2 디렉토리가 존재하는지 검사
            f2.mkdir();                 // 존재하지 않으면 디렉토리 생성
        }

        listDirectory(new File("src/"));          // src 에 있는 파일 리스트 출력
        f2.renameTo(new File("src/javaSample"));    // java_sample -> javaSample로 이름 변경

        listDirectory(new File("src/"));          // javaSample로 변경한 후 리스트 출력
    }
}
