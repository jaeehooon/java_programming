package ch04.exercise.p_12;

class Seat {
    // 필드
    private Person user;            // 좌석을 예약한 사람이 누구인지
    private String name;
    private boolean isEmpty;        // 현재 좌석이 비어있는지

    // 생성자
    public Seat() {};               // 기본 생성자
    public Seat(String name) {
        this.name = name;
        this.isEmpty = true;       // 좌석 클래스가 생성되면 좌석은 비어있지 않다.
    }




    /**
     * Getter, Setter 메소드
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
