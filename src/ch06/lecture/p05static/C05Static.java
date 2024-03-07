package ch06.lecture.p05static;

public class C05Static {
    public static void main(String[] args) {

    }
}

class C05MyClass {
    // static 필드 (class 변수)
    static int age = 30;
    static double area;

    //  [static block]
    // static 멤버 초기 설정용 .. static 필드의 변수 초기화에 여러 구문이 필요한 경우
    static {
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        area = Math.PI * 10 * 10;
    }

    // 생성자

    // 인스턴스 메소드

    // static 메소드
    static void method1() {

    }
}
