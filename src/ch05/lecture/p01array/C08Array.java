package ch05.lecture.p01array;

public class C08Array {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 2, 5, 6, 10, 9, 13};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===============");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("===============");


        // 각 원소를 2배한 값
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }

        System.out.println("===============");
        for (int i : arr) {
            System.out.println(i * 2);
        }
        System.out.println("===============");


        // 2배한 값을 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);
        }
        System.out.println("===============");
        for (int i : arr) {
            i *= 2;
            System.out.println(i);
        }
    }
}
