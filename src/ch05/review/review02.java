package ch05.review;

import java.util.Arrays;

public class review02 {
    public static void main(String[] args) {
        /*
            [Arrays]
        - java.util.Arrays: array 유틸리티 클래스
        toString: 보기좋게 String으로 변환
        sort: 오름차순으로 정렬
        fill: 특정 값으로 배열 채우기
        copyOf: 배열 복사

         */
        int[] arr1 = {3, 9, 7, 5, 1, 6};
        System.out.println(arr1);                   // [I@b4c966a
        System.out.println(Arrays.toString(arr1));  // [3, 9, 7, 5, 1, 6]

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));  // [1, 3, 5, 6, 7, 9]

        int[] arr2 = new int[6];
        Arrays.fill(arr2, 1, 5, 6);
        System.out.println(Arrays.toString(arr2));  // [0, 6, 6, 6, 6, 0]

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] arr4 = arr3;
        int[] arr5 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(STR."\{arr3}, \{arr4}, \{arr5}");
    }
}
