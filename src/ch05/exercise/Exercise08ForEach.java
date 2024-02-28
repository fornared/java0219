package ch05.exercise;

public class Exercise08ForEach {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        double sum = 0, avg = 0;
        int cnt = 0;
        for (int[] row : array) {
            for (int elem : row) {
                sum += elem;
                cnt++;
            }
        }
        avg = sum / cnt;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + avg);
    }
}
