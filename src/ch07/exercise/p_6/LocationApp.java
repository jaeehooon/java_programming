package ch07.exercise.p_6;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

/**
 * 실습문제 6번
 *
 * 도시 이름, 위도, 경도 정보를 가진 Location 클래스를 활용하여
 * 사용자로부터 정보를 입력받고, 검색하는 프로그램
 */
public class LocationApp {
    // 필드
    Scanner scan;                                               // Scanner 객체 레퍼런스
    HashMap<String, Location> locHashMap;                       // 해시맵 객체 레퍼런스

    // 생성자
    public LocationApp() {                                      // 기본 생성자
        scan = new Scanner(System.in);                          // Scanner 객체 생성
        locHashMap = new HashMap<String, Location>();           // 해시맵 객체 생성
    }

    /**
     * 도시 이름 검색프로그램 시작하는 메소드
     */
    void run() {
        insert();
        printAllInfo();
        search();
    }

    /**
     * 사용자로부터 도시 이름, 경도, 위도를 입력받고
     * 해시맵에 저장하는 메소드
     */
    void insert() {
        System.out.println("도시, 경도, 위도를 입력하세요.");
        while (locHashMap.size() < 4) {                         // 4개의 도시를 저장
            System.out.print(">> ");
            String[] input = (scan.nextLine()).split(",");      // 컴마(,)를 기준으로 입력을 split

            // 도시 정보를 해시맵에 추가
            locHashMap.put(input[0].trim(), new Location(input[0].trim(), Integer.parseInt(input[1].trim()), Integer.parseInt(input[2].trim())));
        }
    }

    /**
     * 저장된 도시 정보 전체를 출력하는 메소드
     */
    void printAllInfo() {
        Set<String> keys = locHashMap.keySet();                     // 해시맵에 있는 모든 key를 가져온다
        System.out.println("-----------------------");
        for(String key: keys)
            printInfo(key);
        System.out.println("-----------------------");
    }

    /**
     * 도시 이름을 인자로 받고 해당 Location 객체가 해시맵에 존재하면
     * 현재 객체(도시)의 이름, 위도, 경도 정보를 출력하는 메소드
     * 해당 정보가 없으면 없다고 메세지 출력
     *
     * @param name  도시 이름
     */
    private void printInfo(String name) {
        Location loc = locHashMap.get(name);
        if (loc != null) {
            System.out.println(loc.getName() + "\t" + loc.getLatitude() + "\t" + loc.getLongitude());       // 도시 정보 출력
            return;
        }
        System.out.println(name + "는 없습니다.");
    }

    /**
     * 사용자로부터 도시 이름을 입력받고 해시맵에 해당 도시 이름이 있는지 검색하는 메소드
     */
    void search() {
        while (true) {
            System.out.print("도시 이름 >> ");
            String name = scan.nextLine();          // 도시 이름 입력
            if (name.equals("그만")) {                // "그만"을 입력하면 검색 종료
                scan.close();
                break;
            }
            printInfo(name);                        // 도시 정보를 출력
        }
    }

    public static void main(String[] args) {
        LocationApp app = new LocationApp();
        app.run();
    }
}
