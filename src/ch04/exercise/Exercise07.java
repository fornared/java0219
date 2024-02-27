package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scDep = new Scanner(System.in);
        Scanner scMenu = new Scanner(System.in);
        boolean run = true;
        int sum = 0;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");

            System.out.print("선택> ");
            String menu = scMenu.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.print("예금액> ");
                    int dep = Integer.parseInt(scDep.nextLine());
                    sum += dep;
                }
                case "2" -> {
                    System.out.print("출금액> ");
                    int wdt = Integer.parseInt(scDep.nextLine());
                    sum -= wdt;
                }
                case "3" -> System.out.println("잔고> " + sum);
                case "4" -> run = false;
            }
        }
        System.out.println("\n프로그램 종료");
    }
}
