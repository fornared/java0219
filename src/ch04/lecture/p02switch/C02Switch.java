package ch04.lecture.p02switch;

public class C02Switch {
    public static void main(String[] args) {
        // break가 없으면 코드가 계속 실행됨

        String city = "Seoul";

        System.out.println("statement 1");
        switch (city) {
            case "Seoul":
                System.out.println("statement 2");
                break;
            case "Busan":
                System.out.println("statement 3");
                break;
            case "Jeju":
                System.out.println("statement 4");
                break;
        }
        System.out.println("statement 5");
        System.out.println("statement 6");
    }
}
