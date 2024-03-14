package ch12.lecture.p02wrapper;

public class C04Unboxing {

    public static void main(String[] args) {
        Integer a = 3; // auto boxing
        int c = a.intValue();   // 오래전 unboxing
        int b = a;

        Long d = 5L;

        long e = d; // auto unboxing
        double f = e;   // 기본 타입 형변환
        double g = d;   // auto unboxing, 기본 타입 형변환

        Integer h = null;
        int i = h;  // auto unboxing ... exception

        System.out.println("ex");

    }
}
