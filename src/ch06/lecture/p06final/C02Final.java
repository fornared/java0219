package ch06.lecture.p06final;

public class C02Final {
    public static void main(String[] args) {
        method1(3);
        method2(5);
    }

    static void method1(int i) {

    }

    // final 파라미터
    static void method2(final int j) {
//        j = 50;   //error
    }
}
