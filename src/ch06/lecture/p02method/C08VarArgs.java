package ch06.lecture.p02method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 3);
//        o1.method1(6, 7, 8);  // error

        o1.method2();
        o1.method2(1);
        o1.method2(3, 3);
        o1.method2(6, 7, 8);
        o1.method2(1, 2, 3, 4, 5, 6, 7, 8);

        o1.method3("son", 1, 2, 3, 4);
    }
}

class C08MyClass {
    void method1() {
        System.out.println("C08MyClass.method1, 파라미터 없음");
    }

    void method1(int a) {
        System.out.println("C08MyClass.method1, 파라미터 1개");
    }

    void method1(int a, int b) {
        System.out.println("C08MyClass.method1, 파라미터 2개");
    }

    // varargs (가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) {
        System.out.println("C08MyClass.method1, 파라미터 0개 이상");
        System.out.println(a.length);
    }

    // 다른 파라미터와 함꼐 사용시 꼭 마지막에 넣어야 함
    void method3(String s, int... a) {
        // int... a, String s : error
    }

    void method4(String s, double n, int... a) {

    }
}