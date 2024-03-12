package ch09.lecture.p01nested;

public class C01StaticNestedClass {
    C01MyClass.C01NestedClass obj = new C01MyClass.C01NestedClass();
}

class C01MyClass {
    // 정적(static) 중첩 클래스
    static class C01NestedClass {
        // 필드, 생성자, 메소드
        void method() {
            C01NestedClass obj1 = new C01NestedClass();
        }
    }
}
