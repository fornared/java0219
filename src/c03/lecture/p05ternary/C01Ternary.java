package c03.lecture.p05ternary;

public class C01Ternary {
    public static void main(String[] args) {
        // 삼항연산자(Ternary Operator, 조건 연산자 (Conditional Operator))

        boolean b1 = true;
        char r1 = true ? 'T' : 'F';
        System.out.println("r1 = " + r1);

        int i = 1;
        int r2 = i == 1 ? 1 : 0;
        System.out.println("r2 = " + r2);

        int age = 30;
        String r3 = (age >= 20) ? "어른" : "아이";
        System.out.println("r3 = " + r3);
    }
}
