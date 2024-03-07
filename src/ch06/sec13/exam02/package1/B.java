package ch06.sec13.exam02.package1; // 패키지 동일

public class B {
    // 필드 선언
    A a1 = new A(true); // public 접근
    A a2 = new A(1);    // package private 접근
//    A a3 = new A("문자열");  // private 접근 ~ error
}
