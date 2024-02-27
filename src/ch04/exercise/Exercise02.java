package ch04.exercise;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        System.out.println("grade : " + grade);

        int score1 = 0;

        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result1 = 100 - 20;
                score1 = result1;
                break;
            default:
                score1 = 60;
        }


        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result2 = 100 - 20;
                yield result2;
            }
            default -> 60;
        };

        System.out.println("score1 : " + score1);
        System.out.println("score2 : " + score2);
    }
}
