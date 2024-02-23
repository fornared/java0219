package ch02.lecture.p02type;

public class C21TypeConversion {
    public static void main(String[] args) {
        // 자동 타입변환: 작은 크기 -> 큰 크기
        // 강제 타입변환(casting): 큰 크기 -> 작은 크기
        //                       실수형 -> 정수형

        long a = 234;
//        int b = a;    //error
        int b = (int) a;    //강제 타입변환 (casting)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        short c = 50;
//        byte d = c;   //error
        byte d = (byte) c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        short e = 128;
        byte f = (byte) e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        short g = 384;      // 0000 0001 1000 0000
        byte h = (byte) g;  // ---- ---- 1000 0000
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // 실수형 -> 정수형
        double i = 3.14;
        int j = (int) i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        double k = j;
        System.out.println("k = " + k);
    }
}
