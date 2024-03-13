package ch16.lecture.p01lambda;

public class C03FunctionalInterface {
}

@FunctionalInterface
interface C03MyInterface1 {
    void method1();
}

// @FunctionalInterface   // x
interface C03MyInterface2 {
}

//@FunctionalInterface    // x
interface C03MyInterface3 {
    void method2();

    void method3();
}

@FunctionalInterface    // o
interface C03MyInterface4 {
    void method1();

    default void method2() {

    }
}

@FunctionalInterface    // o
interface C03MyInterface5 {
    void method1();

    // Object 클래스의 public 메소드는 포함하지 않음
    String toString();

    int hashCode();

    boolean equals(Object o);
}