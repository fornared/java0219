package ch04.lecture.p02switch;

public class C07SwitchExpression {
    public static void main(String[] args) {
        int angle = 90; // or 180;
        int answer = 0;

        answer = switch (angle) {
            case 90 -> 2;
            case 180 -> 4;
            default -> 0;     // 결과값을 낼 때 default 꼭 작서
        };

        System.out.println("answer = " + answer);
    }
}
