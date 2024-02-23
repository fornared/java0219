package ch04.lecture.p02switch;

public class C09Yield {
    public static void main(String[] args) {
        String city = "Seoul";  // Paris, London, Tokyo
        String area = switch (city) {
            case "Seoul", "Tokyo" -> "Asia";
            case "Paris", "London" -> {
                System.out.println("statement 1");
                System.out.println("statement 2");
                yield "Europe";     // 마지막에 yield
            }
            default -> "ETC.";
        };
        System.out.println("area = " + area);

        int length = 5;
        String shape = "원"; // 원, 정사각형

        double result = switch (shape) {
            case "원" -> {
                double calc = 3.14 * length * length;
                yield calc;
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };
        System.out.println("result = " + result);
    }
}
