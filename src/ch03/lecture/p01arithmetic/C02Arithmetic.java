package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        // 증감 연산자
        // ++ , --
        // 피연산자 개수: 1개
        // 연산의 결과타입: 피연산자의 타입
        // 연산자 및 피연산자의 위치(순서)에 따라 결과값이 달라질 수 있음에 주의

        int a = 10;
        int a1 = a++;
        System.out.println("a1 = " + a1);   // 10
        System.out.println("a = " + a);     // 11

        int b = 10;
        int b1 = ++b;
        System.out.println("b1 = " + b1);   // 11
        System.out.println("b = " + b);     // 11
    }
}
