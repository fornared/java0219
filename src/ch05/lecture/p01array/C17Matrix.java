package ch05.lecture.p01array;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2];   // 3행 2열

        mat1[1][0] = 5; // 2행 1열의 값을 5로
        mat1[2][1] = 9; // 3행 2열의 값을 9로
        mat1[1][1] = 7; //

        // 전체 탐색은 중첩된 for 사용
        for (int i = 0; i < mat1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat1[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(mat1[i][j]);
            }
            System.out.println("]");
        }
    }
}
