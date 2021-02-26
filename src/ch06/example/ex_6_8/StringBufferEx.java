package ch06.example.ex_6_8;

/**
 * 예제 6-8 | StringBuffer 클래스 메소드 활용
 */
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");                // 문자열 덧붙이기
        System.out.println(sb);

        sb.insert(7, " my");            // "my" 문자열 삽입
        System.out.println(sb);

        sb.replace(8, 10, "your");      // "my"를 "your"로 변경
        System.out.println(sb);

        sb.delete(8, 13);           // "your " 삭제
        System.out.println(sb);

        sb.setLength(4);            // 스트링 버퍼 내 문자열 길이 수정
        System.out.println(sb);     // sb.toString()으로 자동으로 바뀜

    }
}
