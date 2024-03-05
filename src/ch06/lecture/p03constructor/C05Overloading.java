package ch06.lecture.p03constructor;

public class C05Overloading {
    public static void main(String[] args) {
        C05MyClass o1 = new C05MyClass("son", 44);
        C05MyClass o2 = new C05MyClass("lee");
        C05MyClass o3 = new C05MyClass(33);
        C05MyClass o4 = new C05MyClass();

        System.out.println(STR."\{o1.name}, \{o1.age}");
        System.out.println(STR."\{o2.name}, \{o2.age}");
        System.out.println(STR."\{o3.name}, \{o3.age}");
        System.out.println(STR."\{o4.name}, \{o4.age}");
    }
}

class C05MyClass {
    String name;
    int age;

    // 파라미터의 타입, 개수가 다르면 다른 생성자임
    C05MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }

    C05MyClass(String initialName) {
        name = initialName;
        age = 1;
    }

    C05MyClass(int initialAge) {
        name = "홍길동";
        age = initialAge;
    }

    C05MyClass() {
        name = "홍길동";
        age = 1;
    }
}
