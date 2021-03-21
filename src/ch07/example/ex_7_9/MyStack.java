package ch07.example.ex_7_9;

/**
 * 예제 7-9 | 제네릭 스택 만들기
 */

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

public class MyStack {
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<String>();            // String 타입의 GStack 생성

        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for(int n=0; n<3; n++)
            System.out.println(stringStack.pop());                      // stringStack 스택에 있는 3개의 문자열 팝

        GStack<Integer> intStack = new GStack<Integer>();           // Integer 타입의 GStack 생성

        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int n=0; n<3; n++)
            System.out.println(intStack.pop());                     // intStack 스택에 있는 3개의 정수 팝
    }
}
