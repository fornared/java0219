package ch04.sec05;

public class FloatCounterExample {
    public static void main(String[] args) {
        // for문의 index 변수는 정수형으로

        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }
}
