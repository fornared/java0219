package c03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // overflow
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1 = " + var1);
        }
        System.out.println("--------------------------------");
        // underflow
        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2 = " + var2);
        }
    }
}
