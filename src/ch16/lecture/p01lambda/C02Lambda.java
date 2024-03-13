package ch16.lecture.p01lambda;

public class C02Lambda {
    public static void main(String[] args) {
        C02MyInterface obj1 = new C02MyInterface() {
            @Override
            public void method1(int a, int b) {
                System.out.println("C02Lambda.method1");
            }
        };

        // 람다식(Lambda Expression)
        // 추상메소드가 하나인 인터페이스(Functional Interface)의
        // 익명 클래스의 객체 생성 코드를 간단히 한 것
        C02MyInterface obj2 = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            System.out.println("C02Lambda.main");
        };
    }
}


interface C02MyInterface {
    void method1(int a, int b);
}
