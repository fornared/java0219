package ch09.sec07.exam01;

public class C06AnonymousClass {
    public static void main(String[] args) {
        C06MyInterface obj = new C06MyInterface() {
            @Override
            public void method1() {
                System.out.println("C06AnonymousClass.method1");
            }

            @Override
            public void method2() {
                System.out.println("C06AnonymousClass.method2");
            }
        };
        obj.method1();
    }
}

interface C06MyInterface {
    void method1();

    void method2();
}
