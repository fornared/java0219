package ch07.lecture.p02polymorphism;

public class C05Polymorphism {
    A a;

    C05Polymorphism() {
        a = new A();
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();
    }

    public static void main(String[] args) {
        A a = new A();
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();

        method(new A());
        method(new B());
        method(new C());
    }

    private static void method(A a) {
    }
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
    @Override
    public void method1() {
        System.out.println("C.method1");
    }
}