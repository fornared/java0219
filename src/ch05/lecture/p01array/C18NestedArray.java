package ch05.lecture.p01array;

import java.util.Arrays;

public class C18NestedArray {
    public static void main(String[] args) {
        // 1차원 배열
        // 원소의 타입이 int
        int[] arr1 = new int[5];     //원소가 5개인 배열
        System.out.println(Arrays.toString(arr1));

        // 2차원 배열
        // 원소의 타입이 int[]
        int[][] arr2 = new int[3][]; // 원소가 3개인 배열
        System.out.println(Arrays.toString(arr2));

        arr2[0] = new int[6];
        arr2[1] = new int[2];
        arr2[2] = new int[5];
        System.out.println(arr2[0].length + ", " + arr2[1].length + ", " + arr2[2].length);

        // 초기값 지정
        int[] arr3 = new int[]{5, 6, 9};
        int[] arr4 = {7, 4, 3, 8};

        int[][] arr5 = new int[][]{
                {1, 5, 3},
                {3, 11, 23, 37},
                {-7, 3},
                {15, -63, 22, -51, 102}
        };
        int[][] arr6 = {
                {3, 5, 7},
                {2, 1},
                {6, 10, 16}
        };
        int[][] arr7 = new int[4][];
        arr7[0] = new int[]{1, 2, 3};
        arr7[1] = new int[]{-4, -11, 6};
        arr7[2] = new int[]{9, 4};
        arr7[3] = new int[]{2, 5, 11, 8};
    }
}
