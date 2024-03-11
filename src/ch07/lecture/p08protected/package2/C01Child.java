package ch07.lecture.p08protected.package2;

import ch07.lecture.p08protected.package1.C01Parent;

public class C01Child extends C01Parent {
    private void method9() {
        // package private
//        super.method1();

        // protected 접근 가능
        super.method2();
    }
}
