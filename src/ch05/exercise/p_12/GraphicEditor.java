package ch05.exercise.p_12;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class GraphicEditor {
    // 필드
    Scanner scan = new Scanner(System.in);          // Scanner 객체 생성
    Shape head = null, tail = null, obj;            // Shape 객체 레퍼런스. head, tail 은 각각 도형을 연결하는 연결리스트 노드로 이용됨
                                                    // obj는 삽입할 대상을 가리키는 객체 레퍼런스
    // 생성자
    public GraphicEditor() {}                       // 기본 생성자


    /**
     * GraphicEditor 프로그램을 실행하는 메소드
     */
    public void run() {
        int choice;
        System.out.println("그래픽 에디터 beuaty을 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            try {
                choice = scan.nextInt();                    // 번호 입력
            }
            catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다!");
                scan.nextLine();                        // 버퍼비우기
                continue;
            }
            switch(choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    finish();
                    break;
                default:
                    System.out.println("메뉴에 없는 번호입니다!\n");
            }
        }
    }

    /**
     * 도형을 삽입하는 메소드
     */
    void insert() {
        while (true) {
            System.out.print("Line(1), Rect(2), Circle(3) >> ");
            int choice = scan.nextInt();                            // 입력할 도형 선택

            if (choice == 1)        {   obj = new Line();   }
            else if (choice == 2)   {   obj = new Rect();   }
            else if (choice == 3)   {   obj = new Circle(); }
            else {
                System.out.println("없는 도형입니다. 다시 입력하세요! \n");
                continue;
            }

            if(head == null) {		// Linked List 에 아무것도 없다면
                head = obj; 			// 선택한 객체를 처음에 넣고, 즉 head는 새로운 도형을 가리키
                tail = head;			// 해당 객체가 또한 마지막 객체임고
            }
            else { 					// 있다면
                tail.setNext(obj); 		// 마지막 객체로부터 다음 객체(next) 설정
                tail = obj; 			// 마지막 객체는 입력받은 객체이다.
            }

            break;                  // 도형 삽입 완료했으면 while문 종료
        }
    }

    /**
     * 도형을 삭제하는 메소드
     */
    void delete() {
        if (head == null) {              // 리스트가 비어있으면 바로 함수 종료
            System.out.println("삭제할 도형이 없습니다.");
            return;
        }
        System.out.print("삭제할 도형의 위치 >>> ");
        int choice = scan.nextInt();		// 어떤 클래스를 삭제 할 것인지 선택

        try {
            if(choice == 1) {			// 1번째 원소를 없애고자 할 때
                head = head.getNext();		// 1번째 원소가 다음 원소가 가리키는 next값을 받는다.
            }
            else {							// 2번째 원소 이상일 때
                Shape prev = head; 				// '이전'을 가리키는 레퍼런스 변수 생성하고, 이제 부터는 처음(2번째)를 가리킴
                Shape current = head.getNext();	// '현재'의 레퍼런스 변수 생성. 처음(2번째)의 그 다음 원소가 가리키는 next값을 받는다.

                while (choice-2 > 0) {		// 첫번째 원소가 걸러졌으므로 두번째 원소부터 시작한다.
                                            // 하지만 사용자는 0번 인덱스부터가 아닌 1번 인덱스부터 시작하기를 원하므로 총 2를 빼주는 것.
                    prev = prev.getNext();			// '이전'이 가리키는 값이 '현재'의 값을 가리킴

                    if(current.getNext() != null)		// 현재 다음값이 null이 아니면, 즉 다음에도 값이 있다면
                        current = current.getNext();		// 현재의 다음값을 가리키는 next값을 가리킨다.

                    choice--;				// selection 값을 하나씩 줄여나간다.
                }
                prev.setNext(current.getNext());	// 이전의 next값은 현재의 next값으로 설정한다.
            }
        }
        catch (NullPointerException e) {		// 예외처리. 리스트 원소의 개수를 넘어선 숫자를 선택받을 때
            System.out.println("삭제할 수 없습니다.");	// 오류메세지 출력
        }
    }

    /**
     * 현재 삽입된 도형을 모두 출력하는 메소드
     */
    void printAll() {
        Shape temp = head;
        while (temp != null) {		// p가 가리키는 값이 null이 아니면
            temp.draw();			// p가 가리키는 원소의 도형을 그린다, 즉 출력한다.
            temp = temp.getNext();	// 다음을 가리킨다.
        }
    }

    /**
     * 프로그램을 종료하는 메소드
     */
    void finish() {
        System.out.println("beauty을 종료합니다.");
        scan.close();
        System.exit(0);
    }
}
