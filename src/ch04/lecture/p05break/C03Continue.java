package ch04.lecture.p05break;

public class C03Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                System.out.println("명령문1");
                continue;
            }
            System.out.println("명령문2");
        }
    }
}
