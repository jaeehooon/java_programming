package ch07.example.ex_7_10;

/**
 * 예제 7-10 | 스택의 내용을 반대로 만드는 제네릭 메소드 만들기
 */
public class GenericMethodEx {

    /**
     * T가 타입 매개변수인 제네릭 스택을 거꾸로 만드는 메소드
     *
     * @param a         제네릭 타입 클래스 GStack 스택 객
     * @param <T>       제네릭 타입
     * @return          GStack 스택을 거꾸로 만든 제네릭 타입의 GStack 스택 객체
     */
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();              // 스택 a를 반대로 저장할 목적 GStack 생성
        while (true) {
            T tmp;
            tmp = a.pop();              // 원래 스택에서 요소 하나를 꺼냄
            if (tmp == null)            // 스택이 비어있다면
                break;                  // 거꾸로 만드는 작업 종료
            else
                s.push(tmp);            // 새 스택에 요소를 삽입
        }
        return s;                       // 새 스택을 리턴
    }

    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();               // Double 타입의 GStack 생성

        for(int i=0; i<5; i++)              // 5개의 요소를 스택에 push
            gs.push(new Double(i));
        gs = reverse(gs);                   // 5개의 요소를 거꾸로 만들어 새로운 GStack 객체에 담음
        for(int i=0; i<5; i++)
            System.out.println(gs.pop());
    }
}
