package ch06.exercise.p_11;
import java.util.Scanner;

/**
 * 실습문제 11번 (2)
 *
 * StringBuffer를 이용하여 문자열을 수정하는 프로그램
 * !를 기준으로 왼쪽은 바꿀 대상, 오른쪽은 수정될 문자열
 *
 * ex) love!LOVE --> love를 LOVE로 수정
 *
 * StringBuffer 활용 O
 */
public class StringBufferExer2 {
    // 필드
    static Scanner scan;                                        // Scanner 객체 레퍼런스
    static String input;                                        // 사용자로부터 입력받을 명령어 문자열 변수
    static String command;                                      // 명령어를 받을 문자열 변수

    // 생성자
    public StringBufferExer2() {                                 // 기본 생성자
        scan = new Scanner(System.in);                          // Scanner 객체 생성
    };

    public static void main(String[] args) {
        StringBufferExer2 sbe = new StringBufferExer2();
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
                break;
            }

            StringBuffer sbInput = new StringBuffer(input);              // StringBuffer 객체 생성
            int cmdIdx = commandIndex(command);                         // command index 찾기
            if (cmdIdx <= 0) {                                          // 0 또는 음수이면
                System.out.println("잘못된 명령입니다!");                    // 오류 메세지 출력
                continue;
            }
            modify(sbInput, command, cmdIdx);                           // 올바른 명령어 문자열이 입력되면 문자열 수정
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
        return inputStr.indexOf("!");
    }

    /**
     * 원래 단어와 바꿀 단어를 통해 입력으로 받은 문자열을 바꾸는 메소드
     * replace 메소드를 통해 변경, 만약 원래 단어가 입력문자열에 포함되어 있지 않다면
     * 입력 문자열 그대로 반환함
     *
     * @param input     입력 문자열 (StringBuffer 객체)
     * @param cmd       명령어 문자열
     * @param cmdIdx    명령어(!) 인덱스
     * @return          src -> dest 로 바꾼 StringBuffer 객체
     *                  src가 입력 StringBuffer(input)에 없다면 입력 문자열 그대로 반환
     */
    void modify(StringBuffer input, String cmd, int cmdIdx) {
        int []index = findString(input, cmd, cmdIdx);
        if (index[1] == -1)
            System.out.println("찾을 수 없습니다!");
        else
            System.out.println(input.replace(index[0], index[1] + 1, cmd.substring(cmdIdx + 1)));
    }

    /**
     * src 문자열의 인덱스를 찾는 메소드
     *
     * @param input     입력 문자열 (StringBuffer 객체)
     * @param cmd       명령어
     * @param cmdIdx    명령어(!)의 인덱스
     * @return          src 문자열의 가장 앞, 뒤의 인덱스를 담은 int형 배열
     */
    private int[] findString(StringBuffer input, String cmd, int cmdIdx) {
        int[] index = new int[2];
        index[0] = input.indexOf((cmd.substring(0, 1)));
        index[1] = input.indexOf((cmd.substring(cmdIdx - 1, cmdIdx)));
        return index;
    }
}
