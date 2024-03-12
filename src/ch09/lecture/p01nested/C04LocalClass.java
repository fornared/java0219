package ch09.lecture.p01nested;

public class C04LocalClass {
    void method1() {
        int j = 3;  // = final
        int k = 2;  // effectively final
        class LocalClass {
            void method1() {
                int i = 0;
                System.out.println(i);
                i = 1;  // 변경 가능

                // 감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println(j);
//                j = 5;    // 변경 불가 (감싸고 있는 메소드의 변수값은 변경하면 안됨)
                System.out.println(k);
            }
        }
    }
}
