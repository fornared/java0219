package ch05.lecture.p01array;

public class C06Array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};

        // 배열의 길이
        System.out.println("arr.length = " + arr.length);

        // 배열 전체 탐색
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
