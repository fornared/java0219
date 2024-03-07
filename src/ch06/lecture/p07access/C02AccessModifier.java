package ch06.lecture.p07access;

public class C02AccessModifier {
    public static void main(String[] args) {
        // public ~ 다른 파일에서 접근
        C01MyClass o1 = new C01MyClass();
        o1.age = 50;

        // private ~ 다른 파일에서 접근
//        o1.address = "abc";   //error

        // (package private) ~ 다른 파일에서 접근
        o1.name = "abc";
    }
}
