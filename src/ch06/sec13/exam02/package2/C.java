package ch06.sec13.exam02.package2; // 패키지가 다름

import ch06.sec13.exam02.package1.*;

public class C {
    // 필드 선언
    A a1 = new A(true); // public 접근
//    A a2 = new A(1);  // (package private 접근) ~ error
//    A a3 = new A("문자열");  // private 접근 ~ error
}
