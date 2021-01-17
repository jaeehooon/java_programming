package ch03.exercise.p_14;
import java.util.Scanner;

/**
 * 실습 문제 14
 *
 * 과목 이름을 받아 점수를 출력하는 프로그램.
 * 만약, 미리 지정된 과목이 아니라면 없는 과목이라고 출력하고, '그만'을 입력할 떄까지 진행한다.
 */
public class CourseScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Scanner 객체 생성
        while (true) {
            System.out.print("과목 이름 >> ");
            String name = input.next();                 // 과목명 입력
            if (name.equals("그만"))
                break;

            int score = checkScore(name);               // 점수 확인
            if (score != -1)
                System.out.println(name + "의 점수는 " + score);
            else
                System.out.println("없는 과목입니다.");
        }
        input.close();                                  // Scanner 객체 닫기
    }

    /**
     * 사용자로부터 입력받은 이름이 지정된 과목에 있는지, 그 점수가 몇 인지 체크하는 메소드
     *
     * @param name  이름
     * @return      지정된 과목이 있으면 점수를 찾아 반환하고,
     *              없으면 -1을 반환
     */
    public static int checkScore(String name) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};      // 과목
        int[] score = {95, 88, 76, 62, 55};                                    // 점수

        for (int i=0; i< course.length; i++)
            if (course[i].equals(name))
                return score[i];            // 점수 반환
        return -1;
    }
}
