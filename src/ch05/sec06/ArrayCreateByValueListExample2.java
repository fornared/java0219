package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[]{83, 99, 87};
        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        System.out.println("sum1 = " + sum1);
    }
}
