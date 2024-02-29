package ch05.exercise;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        // rcd

        Scanner sc = new Scanner(System.in);
        boolean sw = true;
        int[] scores = new int[0];
        int student = 1, sum = 0, max = 0;
        double avg = 0.0;

        while (sw) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------------");
            System.out.print("선택> ");
            String num = sc.nextLine();
            switch (num) {
                case "1" -> {
                    System.out.print("학생수> ");
                    student = Integer.parseInt(sc.nextLine());
                    scores = new int[student];
                }
                case "2" -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]: ");
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }
                }
                case "3" -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                }
                case "4" -> {
                    for (int i = 0; i < scores.length; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = (double) sum / student;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                }
                case "5" -> {
                    sw = false;
                }
            }
        }

        System.out.println("프로그램 종료");
        sc.close();
    }
}
