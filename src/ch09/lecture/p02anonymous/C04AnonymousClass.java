package ch09.lecture.p02anonymous;

public class C04AnonymousClass {
    public static void main(String[] args) {
        // C04Parent obj = new C04Parent();
        C04Parent obj = new C04Parent() {
            @Override
            void method() {
                System.out.println("C04Child.method");
            }
        };
        obj.method();
    }
}

class C04Parent {
    void method() {
        System.out.println("C04Parent.method");
    }
}