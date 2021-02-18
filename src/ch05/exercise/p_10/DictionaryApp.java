package ch05.exercise.p_10;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");          // 이재문의 값을 C++로 수정

        // 추가 테스트
        /**
        dic.put("황기태3", "자바");
        dic.put("이재문4", "파이썬");
        dic.put("이재문5", "C++");          // 이재문의 값을 C++로 수정
        dic.put("황기태6", "자바");
        dic.put("이재문7", "파이썬");
        dic.put("이재문8", "C++");          // 이재문의 값을 C++로 수정
        dic.put("황기태9", "자바");
        dic.put("이재문10", "파이썬");
        dic.put("이재문11", "C++");          // 이재문의 값을 C++로 수정
        dic.put("황기태12", "자바");
        dic.put("이재문13", "파이썬");
        dic.put("이재문14", "C++");          // 이재문의 값을 C++로 수정
        */

        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));            // 삭제된 아이템 접근

        // 추가 테스트
        /**
        dic.delete("이재문10");
        dic.delete("이재문5");
        System.out.println("이재문10의 값은 " + dic.get("이재문10"));              // 삭제된 아이템 접근
        System.out.println("이재문5의 값은 " + dic.get("이재문5"));                // 삭제된 아이템 접근
         */
    }
}
