package ch16.lecture.p01lambda;

public class C13InstanceMethodReference {
    public static void main(String[] args) {
        C13OtherClass obj1 = new C13OtherClass();
        C13MyInterface lambda1 = (i, j) -> obj1.someMethod(i, j);
        // 2. instance method 참조
        C13MyInterface lambda2 = obj1::someMethod;
    }
}

class C13OtherClass {
    void someMethod(int a, int b) {
        System.out.println("abc");
    }
}

@FunctionalInterface
interface C13MyInterface {
    void method(int x, int y);
}
