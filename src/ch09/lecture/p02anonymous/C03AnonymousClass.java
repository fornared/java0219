package ch09.lecture.p02anonymous;

public class C03AnonymousClass {
    public static void main(String[] args) {
        C03Parent obj = new C03Parent() {
            @Override
            void method() {
                System.out.println("C03AnonymousClass.method");
            }
        };
        obj.method();
    }
}

abstract class C03Parent {
    abstract void method();
}
