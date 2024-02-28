package ch05.lecture.p01array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 04. 참조타입 (배열복사 예제).png
        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr2[0] = 100;

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 2);
        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));
        arr3[0] = 100;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
