package ch03.review;

public class review01 {
    public static void main(String[] args) {
        /*
            [증감 연산자]
        변수의 값을 1 증가 또는 감소시킴 (++, --)
        i++ , ++i
        위치에 따라 결과값이 달라질 수 있음에 주의
         */
        int idoX = 0, idoY = 0;
        int idoResult1 = idoX++;
        int idoResult2 = ++idoY;
        System.out.println("idoResult1 = " + idoResult1);
        System.out.println("idoResult2 = " + idoResult2);

        /*
            [Overflow / Underflow]
        변수 타입이 허용하는 최대/최소값을 벗어나는 것
        (byte) 127(0111 1111) + 1 (0000 0001) = -127 (1000 0000)
         */

        /*
            [Infinity , NaN]
        정수를 0으로 나눗셈 , 나머지 연산할 경우 예외(ArithmeticException) 발생

        실수(double, float)를 0으로 나눗셈 연산 시 Infinity
                              0으로 나머지 연산 시 NaN        반환
         */
        //  int divInt = 5 / 0;     // Exception in thread "main" java.lang.ArithmeticException: / by zero
        float divFloat = 5.0f / 0.0f;
        System.out.println("divFloat = " + divFloat);
        double divDouble = 5.0 % 0.0;
        System.out.println("divDouble = " + divDouble);
    }
}
