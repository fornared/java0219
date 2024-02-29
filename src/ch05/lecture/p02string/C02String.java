package ch05.lecture.p02string;

public class C02String {
    public static void main(String[] args) {
        // String 비교는 equals 사용
        String a = "son";
        String b = "lee";
        String c;
        c = "son";
        String d = new String("son");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        // 참조값 비교
        System.out.println(a == c); // T
        System.out.println(a == d); // F

        // 내용물 비교
        System.out.println(a.equals(c));    // T
        System.out.println(a.equals(d));    // T

    }
}
