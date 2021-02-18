package ch05.exercise.p_10;

/**
 * PairMap 추상 클래스를 상속받아 키와 값으로 이루어져 있는 Dictionary 클래스
 */
public class Dictionary extends PairMap {
    // 필드
    private int numItem;                        // 딕셔너리의 현재 아이템 개수
    private int capacity;                       // 딕셔너리 크기
    private final static int NONE = -1;         //

    // 생성자
    public Dictionary() {}          // 기본 생성자
    public Dictionary(int capacity) {
        this.numItem = 0;
        this.capacity = capacity;
        keyArray = new String[capacity];                // keyArray 배열 생성
        valueArray = new String[capacity];              // valueArray 배열 생성
    }

    /**
     * 인자로 받은 key에 해당 하는 값을 반환하는 메소드
     * 만약 key값이 없으면 null 반환
     *
     * @param key   key
     * @return      key값이 있으면 그에 해당하는 value 반환
     *              없으면 null 반환
     */
    @Override
    String get(String key) {
        int targetIdx = _search(key);
        if (targetIdx != NONE)
            return valueArray[targetIdx];
        return null;
    }

    /**
     * 현재 딕셔너리에 key가 있는지 체크하는 메소드
     *
     * @param key   키
     * @return      현재 인자로 받은 키가 있으면 해당 인덱스를 반환,
     *              없으면 -1을 반환
     */
    private int _search(String key) {
        for(int i=0; i < keyArray.length; i++)
            if (keyArray[i] != null && keyArray[i].equals(key))
                return i;
        return NONE;
    }

    /**
     * 딕셔너리에 key, value 를 넣는 메소드
     * 이미 존재하는 key값이면 해당 value를 수정한다.
     *
     * @param key       key 값
     * @param value     value 값
     */
    @Override
    void put(String key, String value) {
        if (this.numItem < this.capacity) {                     // 현재 아이템 갯수가 딕셔너리 용량보다 작으면
            if (_search(key) == NONE) {                         // key 가 이미 딕셔너리에 있는지 검색. 만약 없으면 put 실행
                keyArray[numItem] = key;
                valueArray[numItem] = value;
                numItem++;
            } else                                              // 이미 있으면 해당 value 수정
                valueArray[numItem] = value;                    // value 수정
        }
        else {
            System.out.println("딕셔너리가 가득 찼습니다!");
        }
    }

    /**
     * 딕셔너리의 key, value를 삭제하는 메소드
     *
     * @param key       삭제할 key 값
     * @return          삭제할 key 값에 대응하는 value 값
     */
    @Override
    String delete(String key) {
        int targetIdx = _search(key);
        if (targetIdx != NONE) {
            // 마지막 인덱스일 경우에 아래의 for문을 돌린 후에
            // null 로 값이 변환되지 않기때문에 따로 처리
            keyArray[targetIdx] = null;
            valueArray[targetIdx] = null;

            for(int i=targetIdx; i<capacity-1; i++) {                   // 삭제할 key 값의 인덱스부터 남은 배열의 인덱스를 앞 당기기
                keyArray[i] = keyArray[i+1];
                valueArray[i] = valueArray[i+1];
            }
            numItem--;
        }
        return null;
    }

    /**
     * 현재 저장된 아이템 갯수를 반환하는 메소드
     *
     * @return  현재 아이템 갯수
     */
    @Override
    int length() {
        return this.numItem;
    }
}
