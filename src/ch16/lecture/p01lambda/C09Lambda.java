package ch16.lecture.p01lambda;

public class C09Lambda {
    public static void main(String[] args) {
        C09MyInterface obj1 = new C09MyInterface() {
            @Override
            public int method() {
                System.out.println("statement...");
                return 0;
            }
        };

        C09MyInterface obj2 = () -> {
            System.out.println("statement...");
            return 0;
        };


        C09MyInterface obj3 = () -> {
            return 0;
        };

        C09MyInterface obj4 = () -> 0;
    }
}

// 1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
// 3. 매개변수가 없고 리턴이 없는 추상 메소드

// 4. 리턴 있는 추상 메소드
@FunctionalInterface
interface C09MyInterface {
    int method();
}