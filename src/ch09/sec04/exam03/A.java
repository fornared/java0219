package ch09.sec04.exam03;

public class A {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);     // o
                System.out.println("var = " + var);     // o
            }

            // 로컬 변수 수정
//            arg = 2;  // x
//            var = 2;  // x
        }

        B b = new B();
        b.method2();

    }
}
