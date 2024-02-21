package c02.lecture.p02type;

public class C25Operation {
    public static void main(String[] args) {
        // 정수 간 연산 결과는 정수
        int a = 10;
        int b = 3;
        int c = a / b;  // 3
        System.out.println("c = " + c);

        double d = a / b;   // 3.3333(x) / 3.0(o)
        System.out.println("d = " + d);

    }
}
