package ch04.exercise.p_12.reservation;
import ch04.exercise.p_12.seats.Seat;
import java.util.Scanner;

/**
 * ConcertApp 을 실행했을 떄 생성되는 클래스
 * 콘서트 좌석 예약 시스템을 담당하는 클래스
 *
 */
public class BookingSystem {
    // 필드
    Scanner input;                              // Scanner 객체 레퍼런스
    Seat[][] seats;                             // 좌석(Seat 클래스) 배치도를 가리키는 레퍼런스
    String [] seatClass = {"S", "A", "B"};      // 좌석 등급 배열

    // 생성자
    public BookingSystem() {
        input = new Scanner(System.in);         // Scanner 객체 생성

        // 좌석 배치
        seats = new Seat[3][10];                // 3x10 Seat객체 배열 생성
        for(int i = 0; i< seats.length; i++)
            for(int j = 0; j< seats[0].length; j++)
                seats[i][j] = new Seat();                           // 좌석 배치도의 Seat 객체 생성
    }

    /**
     * 예약 시스템을 실행하는 메소드
     */
    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        LoopSystem:
        while (true) {
            System.out.print("\n예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
            int menu = input.nextInt();         // 예약 시스템 메뉴 선택
            switch (menu) {
                case 1:
                    book();
                    break;
                case 2:
                    lookUpSeats();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    finish();
                    break LoopSystem;
                default:
                    System.out.println("메뉴에 없는 번호입니다.");
                    break;
            }
        }
    }

    /**
     * 인자로 받은 등급의 좌석 현황을 보여주는 메소드
     *
     * @param classNumber       좌석 등급
     */
    private void printSeats(int classNumber) {
        System.out.print(seatClass[classNumber] + " >>");
        for(int i=0; i<seats[classNumber].length; i++)
            System.out.print(" " + seats[classNumber][i].getP().getName() + " ");
        System.out.println();
    }

    /**
     * 전체 좌석 현황을 출력하는 메소드
     */
    private void printAllSeats() {
        for(int sCls=0; sCls<seats.length; sCls++)
            printSeats(sCls);
    }

    /**
     * 좌석 하나에 Person 객체 사람의 이름을 설정하는 메소드
     *
     * @param name              예약자 이름
     * @param classChoice       예약한 좌석 등급(1: S, 2: A, 3: B)
     * @param seatNumber        예약한 좌석 번호
     */
    private void bookSeat(String name, int classChoice, int seatNumber) {
        seats[classChoice - 1][seatNumber - 1].getP().setName(name);
    }

    /**
     * 좌석 현황을 확인하고, 예약을 진행하는 메소드
     */
    void book() {
        int classChoice;                // 사용자가 선택한 좌석등급
        String name;                    // 예약자 이름
        int seatNumber;                 // 예약할 좌석 번호

        LoopBook: while (true) {
            System.out.print("좌석 구분 S(1), A(2), B(3), 나가기(4) >> ");
            try {
                classChoice = input.nextInt();              // 좌석 클래스 입력
                if (classChoice == 4)                       // 4를 누르면 예약 취소
                    break;
                printSeats(classChoice - 1);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }


            input.nextLine();                       // 버퍼 비우기
            System.out.print("이름 >> ");
            name = input.nextLine();         // 이름 입력

            while (true) {
                System.out.print("번호 >> ");
                seatNumber = input.nextInt();       // 좌석 번호 입력

                try {
                    if (seats[classChoice - 1][seatNumber - 1].getP().getName().equals("___")) {
                        bookSeat(name, classChoice, seatNumber);                // 이름, 좌석등급, 좌석번호를 통해 예약 시도
                        break LoopBook;                                         // 예약 완료되면 '예약(book)' 메소드 종료
                    }
                    else {
                        System.out.println("이미 예약된 좌석입니다.");
                        System.out.println("다른 좌석을 확인하세요!\n\n");
                    }
                }
                catch (ArrayIndexOutOfBoundsException e) {                      // 좌석번호에 없는 번호를 입력하면 오류 메세지 출력
                    System.out.println("1 ~ 10 사이의 좌석번호를 입력하세요!");
                }
            }
        }
    }

    /**
     * 전체 좌석을 조회하기 위해 좌석을 출력하는 메소드
     * printAllSeats()를 호출함
     */
    void lookUpSeats() {
        printAllSeats();
        System.out.println(" <<< 조회를 완료하였습니다. >>> \n");
    }

    /**
     * 예약을 취소하는 메소드
     */
    void cancel() {
        int classChoice;                // 사용자가 선택한 좌석등급

        while(true) {
            System.out.print("좌석 구분 S(1), A(2), B(3), 나가기(4) >> ");

            try {
                classChoice = input.nextInt();              // 좌석 클래스 입력
                if (classChoice == 4)                       // 4를 누르면 예약 취소 나가기
                    return;
                printSeats(classChoice-1);                // 해당 등급 좌석 현황 출력
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 입력입니다!");
            }
        }

        input.nextLine();                       // 버퍼 비우기

        System.out.print("이름 >> ");
        String name = input.nextLine();         // 이름 입력
        if (bookCancel(classChoice, name))
            System.out.println("예약 취소를 완료했습니다!");
        else
            System.out.println("예약되지 않은 이름입니다.");
    }

    /**
     * 좌석 등급, 취소할 이름을 입력받아 예약을 취소하는 메소드
     * 좌석을 모두 순회하여 해당 이름이 있으면 예약취소를 하고,
     * 이름이 없으면 예약된 이름이 없다고 출력
     *
     * @param classChoice   좌석 등급
     * @param name          취소할 예약자 이름
     * @return              취소 완료했으면 true,
     *                      취소하지 못했으면 false 반환
     */
    private boolean bookCancel(int classChoice, String name) {
        for(int i=0; i<seats[classChoice - 1].length; i++) {
            if (seats[classChoice - 1][i].getP().getName().equals(name)) {
                seats[classChoice - 1][i].getP().setName("___");
                return true;
            }
        }
        return false;
    }

    /**
     * 프로그램을 종료하는 메소드
     */
    void finish() {
        System.out.println("에약 시스템을 종료합니다.");
        input.close();
        System.exit(0);
    }
}
