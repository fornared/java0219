package ch03.lecture.p01arithmetic;

public class C05Double {
    public static void main(String[] args) {
        // double은 근사치로 저장
        // ... BigDecimal 객체 사용 또는 정수로 바꿔서 연산
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println("c = " + c);
    }
}
