package ch05.lecture.p01array;

import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {
        //      [java.util.Arrays : 유틸리티 클래스]

        // toString: 배열을 보기 좋게 String으로 반환
        System.out.println("---------toString---------");
        int[] arr1 = {9, 1, 3, 0, 5, 6, 2};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort: 배열을 오름차순으로 정렬
        System.out.println("---------sort---------");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // fill: 특정값으로 배열 채우기
        System.out.println("---------fill---------");
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr2, 23);
        System.out.println(Arrays.toString(arr2));


        // copyOf: 배열 복사
        System.out.println("---------copyOf---------");
        int[] arr3 = {9, 3, 0, 4, 2};
        int[] arr4 = arr3;
        arr4[0] = 10;
        System.out.println(Arrays.toString(arr3));  // [10, 3, 0, 4, 2]
        System.out.println(Arrays.toString(arr4));  // [10, 3, 0, 4, 2]

        int[] arr5 = {5, 6, 7, 1, 2};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);
        arr6[0] = 50;
        System.out.println(Arrays.toString(arr5));  // [5, 6, 7, 1, 2]
        System.out.println(Arrays.toString(arr6));  // [50, 6, 7, 1, 2]


        System.out.println("---------|---------");

    }
}
