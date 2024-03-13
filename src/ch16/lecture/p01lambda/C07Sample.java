package ch16.lecture.p01lambda;

import ch09.lecture.p02anonymous.C08Lambda;

public class C07Sample {
    public static void main(String[] args) {
        C07MyInterface obj1 = str1 -> System.out.println(str1 + str1 + str1);
        C07MyInterface obj2 = str -> System.out.println(str + str);
        C07MyInterface obj3 = str -> System.out.println(str.toUpperCase());
        obj1.method("hi");   // hihihi
        obj2.method("hello");   // hellohello
        obj3.method("spring");  // SPRING
    }
}

@FunctionalInterface
interface C07MyInterface {
    void method(String a);
}