package ch09.lecture.p02anonymous;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj1 = new C08MyInterface() {
            @Override
            public void method() {
                System.out.println("재정의 1");
            }
        };

        C08MyInterface obj2 = () -> System.out.println("재정의 2");

        obj1.method();
        obj2.method();


    }
}

// 추상메소드가 하나인 인터페이스의 익명 클래스 객체 생성시
// 람다 표현식으로 코드를 간단하게 작성할 수 있다.
interface C08MyInterface {
    void method();
}