package ch07.example.ex_7_8;
import java.util.*;

/**
 * 예제 7-8 | Collections 클래스의 활용
 */
public class ColletionsEx {
    /**
     * 리스트의 요소를 모두 출력하는 메소드
     *
     * @param l     String 타입을 담은 LinkedList
     */
    static void printList(LinkedList<String> l) {
        Iterator<String> it = l.iterator();                     // Iterator 객체 리턴
        while(it.hasNext()) {                                   // Iterator 객체에 요소가 있을 때까지 반복
            String e = it.next();                               // 다음 요소 리턴
            String separator;
            if (it.hasNext())
                separator = "->";                       // 마지막 요소가 아니면 -> 출력
            else
                separator = "\n";                       // 마지막 요소이면 줄바꿈
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();           // 빈 리스트 생성
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList);                        // 요소 정렬
        printList(myList);                               // 정렬된 요소 출력

        Collections.reverse(myList);                     // 요소의 순서를 반대로 구성
        printList(myList);                               // 요소 출력

        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }
}
