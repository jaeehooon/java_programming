package ch07.exercise.p_10;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * 그래픽에디터의 기능을 구현한 GraphicEditor 클래스
 */
public class GraphicEditor {
    // 필드
    Scanner scan;                                   // Scanner 객체 레퍼런스
    Vector<Shape> v;                                // Vector 컬렉션 객체 레퍼런스

    // 생성자
    public GraphicEditor() {                        // 기본 생성자
        scan = new Scanner(System.in);              // Scanner 객체 생성
        v = new Vector<>();                    // Vector 객체 생성
    }


    /**
     * GraphicEditor 프로그램을 실행하는 메소드
     */
    public void run() {
        int choice;
        System.out.println("그래픽 에디터 beuaty을 실행합니다.");
        LoopApp: while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            try {
                choice = scan.nextInt();                    // 번호 입력
            }
            catch (InputMismatchException e) {              // 숫자가 아닌 포맷의 값을 입력했을 때의 예외처리
                System.out.println("잘못된 입력입니다!");
                scan.nextLine();                            // 버퍼비우기
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
                    break LoopApp;
                default:
                    System.out.println("메뉴에 없는 번호입니다!\n");
            }
        }
    }

    /**
     * 도형을 삽입하는 메소드
     */
    void insert() {
        Shape obj;
        while (true) {
            System.out.println("Line(1), Rect(2), Circle(3) >> ");
            int choice = scan.nextInt();        // 입력할 도형 선택

            if (choice == 1)        {   obj = new Line();   }
            else if (choice == 2)   {   obj = new Rect();   }
            else if (choice == 3)   {   obj = new Circle(); }
            else {
                System.out.println("없는 도형입니다. 다시 입력하세요! \n");
                continue;
            }
            v.add(obj);             // Vector에 추가
            break;                  // 도형 삽입 완료했으면 while문 종료
        }
    }

    /**
     * 도형을 삭제하는 메소드
     */
    void delete() {
        if (v.size() == 0) {              // Vector의 사이즈가 0이면 삭제할 수 없다는 오류메세지 출력후 메소드 반환
            System.out.println("삭제할 도형이 없습니다.");
            return;
        }

        System.out.print("삭제할 도형의 위치 >>> ");
        int index = scan.nextInt();		// 어떤 클래스를 삭제 할 것인지 선택
        if (!delete(index))
            System.out.println("삭제할 수 없습니다.");
    }

    /**
     * Vector 컬렉션 객체의 요소를 삭제하는 기능을 실제로 하는 메소드
     *
     * @param index     삭제할 요소의 인덱스
     * @return          삭제 성공하면 true,
     *                  삭제를 실패하면 false 반환
     */
    private boolean delete(int index) {
        try {
            v.remove(index);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }



    /**
     * 현재 삽입된 도형을 모두 출력하는 메소드
     */
    void printAll() {
        for(Shape obj: v) {
            obj.draw();
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
