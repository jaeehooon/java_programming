package ch04.exercise.p_7;
import java.util.Scanner;

/**
 * 하루의 할 일을 나타내는 클래스
 */
class Day {
    // 필드
    private String work;                // 하루의 할 일을 나타내는 문자열

    // 생성자
    public Day() {}                 // 기본 생성자

    /**
     * 할 일을 설정하는 메소드
     * @param work      할 일
     */
    public void set(String work) {
        this.work = work;
    }

    /**
     * 할 일을 get하는 메소드
     * (set() 함수가 있기 때문에 만들어 놓은 걸지도..)
     *
     * @return  하루의 할 일
     */
    public String get() {
        return this.work;
    }

    /**
     * 오늘의 할 일을 출력하는 메소드
     */
    public void show() {
        if (work == null)
            System.out.println("없습니다.");
        else
            System.out.println(this.work + "입니다.");
    }
}

/**
 * 한 달의 할 일을 표현하는 클래스
 */
class MonthSchedule {
    // 필드
    private int days;                   // 한 달의 총 일 수
    private Day[] daysArray;            // Day 객체 배열 레퍼런스
    public Scanner input;               // Scanner 객체 레퍼런스

    // 생성자
    public MonthSchedule() {}                       // 기본 생성자
    public MonthSchedule(int days) {
        this.days = days;                           // 필드 초기화
        this.daysArray = new Day[days];             // Day 객체 배열 생성
        for(int i=0; i<daysArray.length; i++)
            daysArray[i] = new Day();               // 배열 원소의 Day 객체 생성
        this.input = new Scanner(System.in); // Scanner 객체 생성
    }

    /**
     * 본 클래스(MonthSchedule)을 실행하는 클래스
     */
    void run() {
        System.out.println("이번 달 스케쥴 관리 프로그램.");
        while (true) {
            showMenu();                         // 메뉴 출력
            int number = input.nextInt();       // 메뉴 번호 입력
            if (number == 1)
                input();
            else if (number == 2)
                view();
            else if (number == 3) {
                finish();
                break;
            }
            else
                System.out.println("메뉴에 없는 번호를 입력했습니다.\n");
        }
    }

    /**
     * 사용자로부터 할 일을 Day 객체 배열에 입력하는 메소드
     */
    void input() {
        int day = 0;                // 날짜

        while (true) {                                  // 사용자가 올바르게 입력할 때까지 루프를 돈다.
            try {
                System.out.print("날짜 >> ");
                day = input.nextInt();                  // 날짜 입력
            }
            catch (Exception e) {
                System.out.println("올바른 입력값이 아닙니다.");
                input.nextLine();                       // 버퍼 비우기
                continue;
            }

            if (day >= 1 && day <= this.days) {         // 올바르 날짜를 입력했으면
                input.nextLine();                       // 버퍼 비우기
                System.out.print("할일(빈칸없이입력)? ");
                String work = input.nextLine();         // 할 일 입력
                Day d = new Day();
                d.set(work);
                daysArray[day - 1] = d;
                System.out.println();
                break;
            }
            else
                System.out.println("해당 날짜는 없는 날짜입니다.\n");
        }
    }

    /**
     * 사용자로부터 원하는 날짜를 입력받고, 해달 날짜에 해당하는 할일을 보여주는 메소드
     */
    void view() {
        int day = 0;                        // 할 일을 볼 날짜
        while (true) {                      // 사용자가 올바르게 입력할 때까지 루프를 돈다.
            try {
                System.out.print("날짜 >> ");
                day = input.nextInt();          // 날짜 입력
            }
            catch (Exception e) {
                System.out.println("올바른 입력값이 아닙니다.");
                input.nextLine();                       // 버퍼 비우기
                continue;
            }

            if (day >= 1 && day <= this.days) {
                System.out.print(day + "일의 할 일은 ");
                daysArray[day - 1].show();
                System.out.println();
                break;
            }
            else
                System.out.println("해당 날짜는 없는 날짜입니다.\n");
        }
    }

    /**
     * 본 클래스를 종료하는 메소드
     */
    void finish() {
        System.out.println("프로그램을 종료합니다.");
        input.close();                      // Scanner 객체 닫기
        System.exit(0);              // 프로그램 종료
    }

    /**
     * 스케쥴 프로그램의 메뉴를 출력하는 메소드
     */
    public void showMenu() {
        System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3) >>> ");
    }
}
