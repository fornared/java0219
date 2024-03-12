package ch09.sec04.exam01;

public class A {
    // 생성자
    A() {
        // 로컬 클래스선언
        class B {
        }

        // 로컬 객체 선언
        B b = new B();
    }
}
