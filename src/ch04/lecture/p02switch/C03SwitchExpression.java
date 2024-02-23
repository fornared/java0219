package ch04.lecture.p02switch;

public class C03SwitchExpression {
    public static void main(String[] args) {
        // switch expression : java 12부터

        int value = 3;
        switch (value) {
            case 1 -> System.out.println("statement 1");
            case 2 -> System.out.println("statement 2");
            case 3 -> {
                // 여러 명령문이 존재하면 {} 사용
                System.out.println("statement 3");
                System.out.println("statement 4");
            }
        }
        System.out.println("statement 5");
    }
}
