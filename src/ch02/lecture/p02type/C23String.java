package ch02.lecture.p02type;

public class C23String {
    public static void main(String[] args) {
        // 참조타입 String
        // 기본타입 <-> 참조타입 간의 형변환은 불가능
        // 기본타입 <-> String 간의 변환은 메소드로 가능

        // 1. String -> 기본타입
        String a = "123";
        byte b = Byte.parseByte(a);
        short c = Short.parseShort(a);
        // char d;
        int e = Integer.parseInt(a);
        long f = Long.parseLong(a);
        float g = Float.parseFloat(a);
        double h = Double.parseDouble(a);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // 2. 기본타입 -> String 변환
        int k = 356;
        double l = 3.14;
        String m = String.valueOf(k);
        String n = String.valueOf(l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        String o = k + "";
        String p = l + "";
        System.out.println("o = " + o);
        System.out.println("p = " + p);

        String str = "5";
        byte var1 = Byte.parseByte(str);
        int var2 = Integer.parseInt(str);
        float var3 = Float.parseFloat(str);
        double var4 = Double.parseDouble(str);
    }
}
