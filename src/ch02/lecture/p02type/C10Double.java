package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C10Double {
    public static void main(String[] args) {
        // Double, float는 근사값으로 저장됨
        double a = 0.1;
        double b = 0.2;
        double s = a + b;

        System.out.println("s = " + s);

        // 정확한 연산 필요시 BigDecimal 사용
        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");
        BigDecimal t = c.add(d);

        System.out.println("t = " + t);

    }
}
