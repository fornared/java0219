package ch03.lecture.p03compare;

public class C01Compare {
    public static void main(String[] args) {
        // 비교 연산자
        // == , != , > , >= , < , <=
        // 연산결과: boolean (true, false)
        // 다른 타입 간 연산 가능 (하지만 가능하면 같은 타입끼리 연산)

        // 실수 간의 ==, != 연산은 주의
        double a = 0.1;
        double b = 0.2;
        float c = 0.1f;

        double s = a + b;
        System.out.println(s == 0.3);   // false
        System.out.println(a == c);     // false

        // String 간의 비교는 equals 메소드 사용
        String str1 = "자바";
        String str2 = "자";
        String str3 = "바";
        String str4 = str2 + str3;

        boolean b1 = (str1 == str4);        // false
        System.out.println("b1 = " + b1);
        boolean b2 = str1.equals(str4);   // true
        System.out.println("b2 = " + b2);

    }

}
