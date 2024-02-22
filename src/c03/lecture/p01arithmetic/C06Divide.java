package c03.lecture.p01arithmetic;

public class C06Divide {
    public static void main(String[] args) {
        // 실수(double, float)를 0으로 나누면 Infinity
        double a = 5.0;
        double posZ = 0.0;
        double negZ = -0.0;

        double result1 = a / posZ;  // Infinity
        double result2 = a / negZ;  // -Infinity
        System.out.println("result1 = " + result1 + ", result2 = " + result2);

        // 실수에서 0으로 나머지 연산(%) 시 NaN
        double result3 = a % posZ;  // NaN
        double result4 = a % negZ;  // NaN
        System.out.println("result3 = " + result3 + ", result4 = " + result4);

        // Infinity와의 연산 결과는 Infinity or NaN
        double result5 = result1 - result1;                         // Inf - Inf = NaN
        System.out.println("result5 = " + result5);
        double result6 = result1 - 1000000000000000000000000.0;     // Inf - (double) = Inf
        System.out.println("result6 = " + result6);
        // NaN과의 연산 결과는 NaN
        double result7 = result3 * 3.0;                             // Nan * (double) = NaN
        System.out.println("result7 = " + result7);

        boolean isInf = Double.isInfinite(result6);
        boolean isNaN = Double.isNaN(result7);
        System.out.println("isInf = " + isInf);
        System.out.println("isNaN = " + isNaN);
    }
}
