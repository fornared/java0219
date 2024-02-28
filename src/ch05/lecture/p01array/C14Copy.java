package ch05.lecture.p01array;

import java.util.Arrays;

public class C14Copy {
    public static void main(String[] args) {
        // System.arraycopy(원본배열, 복사 시작 인덱스, 새 배열, 붙여넣기 인덱스, 복사 항목 수)

        int[] arr1 = {30, 40, 2, 1, 5};
        int[] arr2 = new int[5];

        System.arraycopy(arr1, 0, arr2, 0, 5);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
    }
}
