package ch06.exercise.p_11;
import java.util.Scanner;

/**
 * 실습문제 11번 (1)
 *
 * StringBuffer를 이용하여 문자열을 수정하는 프로그램
 * !를 기준으로 왼쪽은 바꿀 대상, 오른쪽은 수정될 문자열
 *
 * ex) love!LOVE --> love를 LOVE로 수정
 *
 * StringBuffer 활용 X
 */
public class StringBufferExer {
    // 필드
    static Scanner scan;                                        // Scanner 객체 레퍼런스
    static String input;                                        // 사용자로부터 입력받을 명령어 문자열 변수
    static String command;                                      // 명령어를 받을 문자열 변수

    // 생성자
    public StringBufferExer() {                                 // 기본 생성자
        scan = new Scanner(System.in);                          // Scanner 객체 생성
    };

    public static void main(String[] args) {
        StringBufferExer sbe = new StringBufferExer();
        sbe.run();
    }

    /**
     * 문자열 수정하는 프로그램을 실행하는 메소드
     */
    void run() {
        System.out.print(">> ");
        input = scan.nextLine();                                    // 문자열 입력
        while (true) {
            System.out.print("명령: ");
            command = scan.nextLine();                              // 명령어 입력
            if (command.equals("그만")) {
                System.out.println("종료합니다.");
                scan.close();                                       // Scanner 객체 닫기
                break;
            }

            int cmdIdx = commandIndex(command);
            if (cmdIdx <= 0) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }

            String result = modify(input, command, cmdIdx);
            if (result.equals(input))
                System.out.println("찾을 수 없습니다!");
            else
                System.out.println(result);
        }
    }

    /**
     * 명령어(!)의 인덱스를 반환하는 메소드
     *
     * @param inputStr  입력 문자열
     * @return          명령어 (!)의 인덱스값을 반환
     *                  0 또는 -1을 반환하면 잘못된 명령어
     */
    private int commandIndex(String inputStr) {
        for(int i=0; i<inputStr.length(); i++)
            if (inputStr.charAt(i) == '!')
                return i;
        return -1;
    }

    /**
     * 원래 단어와 바꿀 단어를 통해 입력으로 받은 문자열을 바꾸는 메소드
     * replace 메소드를 통해 변경, 만약 원래 단어가 입력문자열에 포함되어 있지 않다면
     * 입력 문자열 그대로 반환함
     *
     * @param input     입력 문자열
     * @param cmd       명령어 문자열
     * @param cmdIdx    명령어(!) 인덱스
     * @return          src -> dest 로 바꾼 문자열
     *                  src가 입력 문자열(input)에 없다면 입력 문자열 그대로 반환
     */
    String modify(String input, String cmd, int cmdIdx) {
        String src = cmd.substring(0, cmdIdx);
        String dest = cmd.substring(cmdIdx+1);
        return input.replace(src, dest);
    }
}
