package c03.lecture.p02assignment;

public class C01Assignment {
    public static void main(String[] args) {
        // assignment operator (할당연산자, 대입연산자)
        // 기호: =
        // 연산 순서는 오른쪽부터
        int a = 5;
        System.out.println("a = " + a);
        int b = 3;
        System.out.println("b = " + b);

        int c = b = a + 7 * 2;
        System.out.print("c = " + c);
        System.out.print(",  b = " + b);
        System.out.println(",  a = " + a);
    }
}
