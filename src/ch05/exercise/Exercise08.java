package ch05.exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalSum = 0, totalCnt = 0, totalAvg = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
                totalCnt++;
            }
        }
        System.out.println("전체 합: " + totalSum);
        totalAvg = totalSum / totalCnt;
        System.out.println("평균: " + totalAvg);
    }
}
