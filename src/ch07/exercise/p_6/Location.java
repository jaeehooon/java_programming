package ch07.exercise.p_6;

/**
 * 도시 이름, 위도, 경도를 멤버로 가지는 Location 클래스
 */
class Location {
    // 필드
    private String name;                // 도시 이름
    private int latitude;               // 위도
    private int longitude;              // 경도

    // 생성자
    public Location() {}                // 기본 생성자
    public Location(String name, int latitude, int longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * 멤버 변수의 Getter 메소드
     */
    public String getName() {
        return name;
    }
    public int getLatitude() {
        return latitude;
    }
    public int getLongitude() {
        return longitude;
    }
}
