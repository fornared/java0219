package ch05.lecture.p01array;

public class C11Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i : arr) {
            System.out.println(i);
        }

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
