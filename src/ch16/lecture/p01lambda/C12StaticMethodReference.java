package ch16.lecture.p01lambda;

public class C12StaticMethodReference {
    public static void main(String[] args) {
        C12MyInterface obj1 = (x, y) -> C12OtherClass.method(x, y);
        C12MyInterface obj2 = C12OtherClass::method;
    }
}

class C12OtherClass {
    static int method(int c, int d) {
        System.out.println("ab");
        return 0;
    }
}

@FunctionalInterface
interface C12MyInterface {
    int method(int x, int y);
}