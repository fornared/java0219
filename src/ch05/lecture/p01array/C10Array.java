package ch05.lecture.p01array;

public class C10Array {
    public static void main(String[] args) {
        int[] arr1 = {9, 6, 3, 0};  // 배열의 길이 및 각 원소가 정의됨

        // 배열의 길이만 정의
        // 각 원소는 초기값{0, false, null, ...}으로 정의됨 (p.172)
        int[] arr2;
        arr2 = new int[2];          // 배열의 길이(2)만 정의됨

        int[] arr3 = new int[3];    // 배열의 길이(3)만 정의됨

        var arr4 = new int[8];      // 배열의 길이(8)만 정의됨
        boolean[] arr5 = new boolean[4];

        System.out.println(arr3[2]);
        System.out.println(arr5[1]);
    }
}
