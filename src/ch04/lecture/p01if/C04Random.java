package ch04.lecture.p01if;

public class C04Random {
    public static void main(String[] args) {
        // Math.random() : 0.0 <= n < 1.0 의 범위를 갖는 double n 난수를 리턴

        //      [1~6의 주사위]
        // 0.0 <= Math.random() < 1.0
        // 0.0 <= Math.random() * 6 < 6.0
        // 1.0 <= (Math.random() * 6) + 1 < 7.0
        // 1 <= (int) ((Math.random() * 6) + 1) < 7
        // (int) ((Math.random() * 6) + 1) = [1, 2, 3, 4, 5, 6]

        double random1 = Math.random();     // 0.0 <= (double 리턴값) < 1.0
        System.out.println("random1 = " + random1);

        double value1 = random1 * 6;        // 0.0 <= value1 < 6.0
        System.out.println("value1 = " + value1);

        double value2 = value1 + 1;         // 1.0 <= value2 < 7.0
        System.out.println("value2 = " + value2);

        int num = (int) value2;             // 1 <= num < 7 ... 1, 2, 3, 4, 5, 6
        System.out.println("num = " + num);

        int dice = (int) ((Math.random() * 6) + 1);
        System.out.println("dice = " + dice);
    }
}
