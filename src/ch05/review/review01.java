package ch05.review;

public class review01 {
    public static void main(String[] args) {
        /*
            [향상된(enhanced) for문]
        for ( 변수 : 배열) {
            실행문
        }
        전체 항목 개수만큼 반복
         */
        int[] arr1 = {1, 3, 5, 7, 9};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        for (int i : arr1) {
            System.out.print(i + ",");
        }

        /*
            [배열의 선언]
         */

    }
}
