package ch03.exercise.p_13;

/**
 * 실습 문제 13
 *
 * 반복문을 이용하여 369 게임에서 박수를 쳐야하는 경우를 순서대로 화면에 출력하는 프로그램
 */
public class Clap {
    public static void main(String[] args) {
        int cnt = 0;                    // 숫자에 3, 6, 9가 몇 개 들어갔는지 체크하는 변수

        for(int i=1; i<100; i++) {
            cnt = howMany(i);
            if (cnt > 0) {
                System.out.print(i + " 박수 ");

                for(int j=0; j<cnt; j++)
                    System.out.print("짝");
                System.out.println();
            }
        }
    }

    /**
     * 인자로 받은 숫자에 3, 6, 9가 몇 개가 들어갔는지 확인하는 메소드
     *
     * @param number    임의의 숫자
     * @return          3, 6, 9가 몇 개 들어있는지 갯수 반환
     */
    public static int howMany(int number) {
        int count = 0;

        while (number != 0) {                       // number 가 0이 아닐 때까지 루프를 돈다.
            int i = number % 10;                    // 나머지
            number /= 10;                           // 몫

            if (i == 3 || i == 6 || i == 9)         // 3, 6, 9 중에 하나가 있으면
                count++;                            // 갯수 증가

        }
        return count;
    }
}
