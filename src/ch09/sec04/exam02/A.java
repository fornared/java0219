package ch09.sec04.exam02;

public class A {
    // 메소드
    void useB() {
        // 로컬 클래스
        class B {
            // 인스턴스 필드
            int field1 = 1;

            // 정적 필드
            static int field2 = 2;

            // 생성자
            B() {
                System.out.println("B-생성자 실행");
            }

            // 인스턴스 메소드
            void method1() {
                System.out.println("B-생성자2 실행");
            }
        }
    }
}
