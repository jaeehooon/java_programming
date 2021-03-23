package ch07.exercise.p_4;
import java.util.Scanner;
import java.util.Vector;

/**
 * 실습문제 4번
 *
 * Vector 컬렉션을 이용하여 강수량의 평균을 유지관리 하는 프로그램
 */
public class PrecipitationApp {
    // 필드
    Scanner scan;                               // Scanner 객체 레퍼런스
    Vector<Integer> rainVec;                    // 강수량을 담을 Vector 객체

    // 생성자
    public PrecipitationApp() {                 // 기본 생성자
        scan = new Scanner(System.in);          // Scanner 객체 생성
        rainVec = new Vector<Integer>();
    }

    /**
     * 강수량의 평균을 유지 관리하는 프로그램을 실행하는 메소드
     */
    void run() {
        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료) >>> ");
            try {
                int input = scan.nextInt();                 // 강수량 입력
                if (input == 0) {                           // 강수량이 0이면 프로그램 종료
                    scan.close();
                    break;
                }

                rainVec.add(input);                         // Vector 객체에 추가
                print(rainVec);                             // Vector 객체들을 출력
                System.out.println("현재 평균 " + average(rainVec));
            }
            catch (NumberFormatException e) {               // 정수가 아닌 수에 대한 예외처리
                System.out.println("다시 입력하세요!");
            }
        }
    }

    /**
     * 현재 Vector 객체 내의 담겨져있는 요소의 평균을 구하는 메소드
     *
     * @param vector        Vector<Integer> 객체
     * @return              평균값
     */
    int average(Vector<Integer> vector) {
        int sum = 0;
        int size = getSize();
        for(int i=0; i<size; i++)
            sum += vector.get(i);
        return sum / size;
    }

    /**
     * 현재 Vector 객체내에 있는 요소를 출력하는 메소드
     *
     * @param vector        Vector<Integer> 객체
     */
    void print(Vector<Integer> vector) {
        for (Integer integer : vector)
            System.out.print(integer + " ");
        System.out.println();
    }

    /**
     * 강수량을 담는 Vector의 사이즈를 얻는 메소드
     *
     * @return      현재 Vector의 사이즈
     */
    private int getSize() {
        return rainVec.size();
    }

    public static void main(String[] args) {
        PrecipitationApp app = new PrecipitationApp();
        app.run();
    }
}
