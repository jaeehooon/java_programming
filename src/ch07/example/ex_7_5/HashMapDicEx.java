package ch07.example.ex_7_5;
import java.util.*;

/**
 * 예제 7-5 | HashMap을 이용하여 (영어, 한글) 단어 쌍의 저장 검색
 */
public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();                // 해시맵 생성

        // 3개의 (key, value) 쌍을 dic에 저장
        dic.put("baby", "아기");          // "baby"는 key, "아기"는 value
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        // 사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
        Scanner scan = new Scanner(System.in);              // Scanner 객체 생성
        while (true) {
            System.out.print("찾고 싶은 단어는? ");
            String eng = scan.next();
            if (eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            // 해시맵에서 '키' eng의 '값' kor 검색
            String kor = dic.get(eng);
            if (kor == null)
                System.out.println(eng + "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }

        scan.close();
    }
}
