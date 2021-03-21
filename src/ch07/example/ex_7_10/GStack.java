package ch07.example.ex_7_10;

/**
 * 제네릭 타입에 대한 스택 클래스
 *
 * @param <T>
 */
class GStack<T> {
    // 필드
    int tos;
    Object[] stck;                  // 스택에 요소를 저장할 공간 배열

    // 생성자
    public GStack() {
        tos = 0;
        stck = new Object[10];
    }

    /**
     * 제네릭 스택 클래스에 아이템을 추가하는 메소드
     *
     * @param item      제네릭 타입의 아이템
     */
    public void push(T item) {
        if (tos == 10)              // 스택이 꽉 차서 더 이상 요소를 삽입할 수 없음
            return;
        stck[tos] = item;           // 현재 인덱스에 item 추가
        tos++;                      // 인덱스 증가
    }

    public T pop() {
        if (tos == 0)               // 스택이 비어 있어 꺼낼 요소가 없음
            return null;
        tos--;
        return (T)stck[tos];        // 타입 매개변수 타입으로 캐스팅
    }
}

