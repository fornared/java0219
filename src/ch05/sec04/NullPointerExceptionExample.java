package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 5;   // NullPointerException

        String str = null;
//        System.out.println("총 문자 수: " + str.length());    // NullPointerException

        System.out.println("종료");
    }
}
