package ch07.exercise.p_11.vector;

/**
 * 나라를 가리키는 Nation 클래스
 * '수도'를 필드로 갖고 있음
 */
class Nation {
    // 필드
    private String country;            // 나라 이름
    private String capital;         // 수도 이름

    // 생성자
    public Nation() {}              // 기본 생성자
    public Nation(String country, String captital) {
        this.country = country;
        this.capital = captital;
    }

    /**
     * 멤버 변수의 Getter 메소드
     */
    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }
}
