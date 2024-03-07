package ch06.lecture.p03constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass5 obj5 = new C09MyClass5();
    }
}

class C09MyClass5 {
    /*  작성하지 않았지만 자동으로 추가된 상태
    public C09MyClass5() {

    }
     */
}

class C09MyClass4 {
    int age;

    public C09MyClass4() {
        // 자동으로 만들어지지 않기 때문에 필요하면 직접 만들어야 함
    }

    public C09MyClass4(int age) {
        this.age = age;
    }
}

class C09MyClass3 {
    // 필드 x

    // 생성자 x

    //  [no-args constructor (default constructor)]
    // 파라미터 없는 생성자, 기본 생성자
    // : 생성자를 작성하지 않으면(*)
    //   파라미터 없는 생성자가 자동으로 추가
    //   단, 생성자를 작성하면 추가되지 않음


    // 메소드 x
}

class C09MyClass2 { // 생성자
    public C09MyClass2() {
    }
}

class C09MyClass1 { // 필드, 생성자
    int age;

    public C09MyClass1(int age) {

    }
}