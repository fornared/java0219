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
        System.out.println();


        /*
            [배열의 선언]
        타입[] 변수;
        배열의 선언과 할당을 동시에 할 땐 'new int[]' 생략 가능
         */
        int[] dec1;
        dec1 = new int[]{5, 3};
        int[] dec2 = new int[]{5, 3, 4};
        int[] dec3 = {5, 3, 4};
        int[] dec4;  // dec4 = {5, 3, 4};   error

        // 배열의 길이만 정의
        // 각 원소는 초기값{0, false, null, ...}으로 정의됨 (p.172)
        int[] dec5 = new int[3];
        for (int i : dec5) {
            System.out.print(STR."\{i},");
        }
        System.out.println();
        dec5[0] = 1;
        dec5[1] = 2;
        dec5[2] = 3;
        for (int i : dec5) {
            System.out.print(STR."\{i},");
        }
    }
}
