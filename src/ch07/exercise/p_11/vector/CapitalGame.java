package ch07.exercise.p_11.vector;
import java.util.Scanner;
import java.util.Vector;

/**
 * 수도 맞추기 게임을 나타내는 CapitalGame 클래스
 *
 * 나라, 수도 이름을 입력하는 insert(),
 * 퀴즈를 진행하는 quiz(),
 * 게임을 종료하는 finish() 메소드를 가지고 있음
 */
class CapitalGame {
    // 필드
    Scanner scan;                                   // Scanner 객체 레퍼런스
    Vector<Nation> vector;                          // Nation 객체들을 담는 Vector 컬렉션 레퍼런스

    // 생성자
    public CapitalGame() {                          // 기본 생성자
        scan = new Scanner(System.in);              // Scanner 객체 생성
        vector = new Vector<>();                    // Nation 클래스를 담는 Vector 객체 생성
        preInsert();
    }

    /**
     * 게임을 실행할 때 기본적으로 설정될 벡터 컬렉션 요소를 삽입하는 메소드
     */
    private void preInsert() {
        vector.add(new Nation("멕시코", "멕시코시티"));
        vector.add(new Nation("영국", "런던"));
        vector.add(new Nation("일본", "도쿄"));
        vector.add(new Nation("오스트리아", "빈"));
        vector.add(new Nation("체코", "프라하"));
        vector.add(new Nation("포루투갈", "리스본"));
        vector.add(new Nation("폴란드", "바르사바"));
        vector.add(new Nation("호주", "캔버라"));
        vector.add(new Nation("독일", "베를린"));
        vector.add(new Nation("덴마크", "코펜하겐"));
    }

    /**
     * 나라와 수도 맞추기 게임을 실행하는 메소드
     */
    void run() {
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while (true) {
            showMenu();
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    insertNations();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    finish();
                    break;
                default:
                    System.out.println("메뉴에 없는 번호입니다!");
            }
        }
    }

    /**
     * 게임을 구성하는 3가지 메뉴를 출력하는 메소드
     */
    void showMenu() {
        System.out.print("입력: 1, 퀴즈: 2, 종료: 3 >>> ");
    }

    /**
     * Vector 컬렉션에 나라, 수도 이름을 입력하는 메소드
     */
    void insertNations() {
        String input;
        scan.nextLine();                                        // 버퍼 비우기
        System.out.println("현재 " + vector.size() + "개 나라와 수도가 입력되어 있습니다.");

        while (true) {
            System.out.print("나라와 수도 입력" + vector.size() + ">> ");
            input = scan.nextLine();
            if (input.equals("그만"))
                break;

            String[] elements = input.split(" ");               // 입력받은 문자열을 split

            if (elements.length == 2)
                insertNations(elements[0], elements[1]);                // Vector 컬렉션에 추가
            else
                System.out.println("잘못된 입력입니다!");
        }
    }

    /**
     * 사용자로부터 입력받은 나라 이름, 수도 이름을 통해 벡터 컬렉션에 추가하는 메소드
     * 만약, 이미 존재하는 나라 이름이라면 이미 존재한다는 오류 메세지 출력
     *
     * @param country   나라 이름
     * @param capital   수도 이름
     */
    private void insertNations(String country, String capital) {
        for (Nation nation : vector) {                                      // Vector 컬렉션의 사이즈만큼 루프를 돈다
            if (nation.getCountry().equals(country)) {                      // 이미 벡터 컬렉션에 나라 이름이 있는지 체크
                System.out.println(country + "는 이미 있습니다!");
                return;
            }
        }
        vector.add(new Nation(country, capital));                           // 벡터 컬렉션에 없으면 인자로 받은 값들로부터 Nation 객체를 추가
    }

    /**
     * 퀴즈를 실행
     * 벡터 컬렉션 사이즈만큼의 숫자에서 랜덤한 숫자를 받고, 해당 숫자의 인덱스의 Nation 객체의 정보를 묻는다.
     */
    void quiz() {
        scan.nextLine();                            // 버퍼 비우기
        while (true) {
            int ranNum = (int)(Math.random() * vector.size());
            System.out.print(vector.get(ranNum).getCountry() + "의 수도는? ");
            String input = scan.nextLine();
            if (input.equals("그만"))                                             // 입력이 "그만"이면 종료
                break;

            if (quiz(input, ranNum))                  // 입력한 값이 수도이름과 같은지 체크
                System.out.println("정답입니다!");
            else
                System.out.println("아닙니다!!");
        }
    }

    /**
     * 입력한 문자열과 수도이름이 같은지 판별하는 메소드
     *
     * @param input     사용자가 입력한 입력값
     * @param ranNum    랜덤함수를 통해 얻은 랜덤한 숫자. 벡터 컬렉션의 인덱스로 사용됨
     * @return          입력값과 수도 이름이 같으면 true,
     *                  다르면 false 반환
     */
    private boolean quiz(String input, int ranNum) {
        return input.equals(vector.get(ranNum).getCapital());
    }

    /**
     * 프로그램을 종료하는 메소드
     */
    void finish() {
        System.out.println("게임을 종료합니다.");
        scan.close();
        System.exit(0);
    }

}
