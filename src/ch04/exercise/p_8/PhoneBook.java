package ch04.exercise.p_8;
import java.util.Scanner;

/**
 * Phone 클래스
 *
 * 이름, 전화번호를 필드로 가진다.
 */
class Phone {
    // 필드
    private String name;                // 이름
    private String phoneNumber;         // 전화번호

    // 생성자
    public Phone() {}                   // 기본 생성자
    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter PhoneNumber 메소드
     *
     * @return  객체의 PhoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Getter name 메소드
     *
     * @return  객체의 name
     */
    public String getName() {
        return this.name;
    }
}

/**
 * Phone 클래스로 이루어진 객체 배열을 활용하여
 * 이름, 전화번호를 저장하는 역할을 하는 클래스
 *
 */
class PhoneBook {
    // 필드
    public Scanner input;                       // Scanner 객체 레퍼런스
    public Phone[] phoneBookArray;              // Phone 객체를 담는 배열 레퍼런스

    // 생성자
    public PhoneBook() {                        // 기본 생성자
        input = new Scanner(System.in);
    }

    /**
     * PhoneBook 프로그램을 실행하는 메소드
     */
    public void run() {
        System.out.print("인원수 >> ");
        int number = input.nextInt();           // 인원수 입력
        phoneBookArray = new Phone[number];     // 사용자가 입력한 수만큼의 Phone 객체 배열 생성

        save(number);           // 전화번호 저장
        search();                   // 검색 시작
    }

    /**
     * 검색을 하는 메소드
     */
    public void search() {
        while (true) {
            System.out.print("검색할 이름 >> ");
            String name = input.nextLine();             // 찾을 이름 입력

            if (name.equals("그만")) {                   // 그만을 입력하면
                finish();                               // 프로그램 종료
                break;
            }
            _search(name);                              // 이름 검색
        }
    }

    /**
     * 인자로 이름을 입력받아 저장된 객체 배열 내에서 동일한 이름이 있는지 찾는 메소드
     *
     * @param name      찾을 이름
     */
    private void _search(String name) {
        for (Phone phone : phoneBookArray) {        // 배열의 크기만큼 루프를 돈다.
            if (phone.getName().equals(name)) {     // 찾는 이름이 있으면
                System.out.println(name + "의 번호는 " + phone.getPhoneNumber() + " 입니다.");      // 전화번호 출력
                return;             // 찾은 전화번호 출력후 메소드 종료
            }
        }

        // 찾는 이름이 없다면
        System.out.println(name + "이 없습니다.");
    }
    /**
     * 이름과 전화번호를 저장하는 메소드
     */
    public void save(int number) {
        for(int i=0; i< phoneBookArray.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = input.next();                     // 이름 입력
            String phoneNumber = input.next();              // 전화번호 입력
            phoneBookArray[i] = new Phone(name, phoneNumber);
        }
        System.out.println("저장되었습니다....");
        input.nextLine();                                  // 버퍼 비우기
    }

    /**
     * 프로그램을 종료하는 메소드
     */
    public void finish() {
        input.close();
        System.exit(0);
    }
}
