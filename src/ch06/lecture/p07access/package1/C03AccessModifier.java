package ch06.lecture.p07access.package1;

import ch06.lecture.p07access.C01MyClass;

public class C03AccessModifier {
    public static void main(String[] args) {
        // public ~ 다른 패키지에서 접근
        C01MyClass o1 = new C01MyClass();
        o1.age = 70;

        // private ~ 다른 패키지에서 접근
//        o1.address = "abd";   //error

        // (package private) ~ 다른 패키지에서 접근
//        o1.name = "abc";  // error
    }
}
