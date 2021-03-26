package ch07.exercise.p_8;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

/**
 * 고객의 포인트 점수를 관리하는 PointManager 클래스
 *
 * 고객의 정보를 추가하고, 출력하는 메소드를 가짐
 */
class PointManager {
    // 필드
    Scanner scan;                   // Scanner 객체 레퍼런스
    HashMap<String, Customer> hm;   // 해시맵 객체 레퍼런스

    // 생성자
    public PointManager() {
        scan = new Scanner(System.in);          // Scanner 객체 생성
        hm = new HashMap<String, Customer>();   // 해시맵 객체 생성
    }

    /**
     * 관리 프로그램을 실행하는 메소드
     */
    void run() {
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String[] input = (scan.nextLine()).split(" ");              // 이름과 포인트 입력 (띄어쓰기로 분리)
            if (input[0].equals("그만"))                                       // 그만을 입력하면 프로그램 종료
                break;

            add(input[0], Integer.parseInt(input[1]));                        // 이름, 포인트 순으로 해시맵에 추가
            printAll();                                                       // 추가하고 모든 고객 정보를 출력
        }
        scan.close();
    }

    /**
     * 해시맵에 고객의 이름과 포인트점수를 추가하는 메소드
     * 사용자로부터 '이름', '점수'를 입력받는다.
     *
     * @param name      이름
     * @param point     포인트점수
     */
    private void add(String name, int point) {
        Customer customer = hm.get(name);                                       // 해시맵으로부터 인자로 받은 이름의 고객이 있는지 확인
        if (customer == null)                                                   // 현재 해시맵에 해당 이름은 없음
            hm.put(name, new Customer(name, point));                            // 해시맵에 추가
        else                                                                    // 이미 있는 이름이라면
            customer.setPointScore(customer.getPointScore() + point);           // 해당 고객의 포인트점수를 추가
    }

    /**
     * 현재 해시맵에 존재하는 모든 고객정보를 출력하는 메소드
     * Set 컬렉션을 통해 모든 key값들을 가져옴. 해시맵에 넣은 순서대로 가져오지 않는다.
     */
    void printAll() {
        Set<String> keys = hm.keySet();
        for(String key: keys)
            printCustomer(key);
        System.out.println();
    }

    /**
     * 고객 1명의 정보를 출력하는 메소드
     *
     * @param key   고객 이름
     */
    private void printCustomer(String key) {
        Customer customer = hm.get(key);                // 현재 해시맵으로부터 Customer 객체 가져옴
        System.out.print("(" + customer.getName() + ", " + customer.getPointScore() + ") ");        // 정보 출력
    }
}
