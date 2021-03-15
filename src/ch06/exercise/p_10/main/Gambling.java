package ch06.exercise.p_10.main;
import ch06.exercise.p_10.user.Person;
import java.util.Scanner;

public class Gambling {
    // 필드
    Scanner scan;                           // Scanner 객체 레퍼런스
    Person [] users;                        // 게임에 참여하는 Person 객체 배열 레퍼런스
    int[] randomNumbers;                    // 3개의 난수를 담을 int형 객체 레퍼런스

    // 생성자
    public Gambling() {                     // 기본 생성자
        scan = new Scanner(System.in);      // Scanner 객체 생성
        users = new Person[2];              // Person 객체배열 생성
    }

    /**
     * 갬블링 게임을 실행하는 메소드
     */
    public void run() {
        setUsers();
        int idx = 0;
        while (true) {
            if (play(users[idx])) {
                System.out.println("\t" + users[idx].getName() + "님이 이겼습니다!");
                break;
            }
            System.out.println("\t아쉽군요!");

            if (idx == 0)
                idx++;
            else
                idx--;
        }
    }

    /**
     * 게임 실행 된 뒤에 두 사람의 이름을 입력받는 메소드
     * Person 클래스를 통해 객체 생성하고, 이름을 설정
     */
    void setUsers() {
        for(int i=0; i<users.length; i++) {
            System.out.print((i + 1) + "번째 선수 이름 >> ");
            String name = scan.nextLine();
            users[i] = new Person();
            users[i].setName(name);
        }
    }

    /**
     * 1 게임
     * 1~3 범위의 난수를 발생하여 3개의 숫자가 모두 같은지 다른지에 따라 반환값 결정

     * @param user      게임 유저 이름
     * @return          해당 유저가 1게임을 실행했을 때, 그에 대한 결과를 boolean값으로 반환
     */
    boolean play(Person user) {
        System.out.print("[" + user.getName() + "] : <Enter> ");
        scan.nextLine();                                // Enter 키를 입력받음

        randomNumbers = makeRandomNumbers();            // 난수 생성
        printNumbers(randomNumbers);                    // 발생한 난수를 출력
        return checkNumbers(randomNumbers);             // 생성된 난수 3개가 모두 같은지 판별하는 메소드 호출
    }

    /**
     * 인자로 받은 int형 배열을 출력하는 메소드
     *
     * @param numbers       3개의 난수를 담은 int형 배열
     */
    private void printNumbers(int[] numbers) {
        for (int number : numbers)
            System.out.print("\t" + number);
    }

    /**
     * 난수를 생성하는 메소드
     *
     * @return      3개의 난수를 담은 int형 배열
     */
    private int[] makeRandomNumbers() {
        int [] numbers = new int[3];                        // 3개의 난수를 담을 int형 배열
        for(int i=0; i<numbers.length; i++)
            numbers[i] = (int)(Math.random() * 3 + 1);
        return numbers;
    }

    /**
     * 인자로 받은 int형 배열의 숫자가 모두 같은지 판별하는 메소드
     *
     * @param numbers       int형 배열
     * @return              3개의 숫자가 같으면 true,
     *                      다르면 false 반환
     */
    private boolean checkNumbers(int[] numbers) {
        return (numbers[0] == numbers[1] && numbers[1] == numbers[2]);
    }
}
