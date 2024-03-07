package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
        int countOfAcc = 0;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("""
                    ---------------------------------------------------
                    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                    ---------------------------------------------------""");
            System.out.print("선택> ");
            String menu = sc.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");

                    Account account = new Account();
                    System.out.print("계좌번호: ");
                    account.setNumber(sc.nextLine());
                    System.out.print("계좌주: ");
                    account.setName(sc.nextLine());
                    System.out.print("초기 입금액: ");
                    account.setBalance(Integer.parseInt(sc.nextLine()));

                    accounts[countOfAcc] = account;
                    countOfAcc++;

                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    System.out.println("---------");
                    System.out.println("계좌목록");
                    System.out.println("---------");

                    for (int i = 0; i < countOfAcc; i++) {
                        System.out.println(STR."\{accounts[i].getNumber()}     \{accounts[i].getName()}     \{accounts[i].getBalance()}");
                    }
                }
                case "3" -> {
                    System.out.println("---------");
                    System.out.println("예금");
                    System.out.println("---------");

                    System.out.print("계좌번호: ");
                    String accNum = sc.nextLine();
                    System.out.print("예금액: ");
                    int deposit = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < countOfAcc; i++) {
                        if (accounts[i].getNumber().equals(accNum)) {
                            accounts[i].setBalance(accounts[i].getBalance() + deposit);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("---------");
                    System.out.println("출금");
                    System.out.println("---------");

                    System.out.print("계좌번호: ");
                    String accNum = sc.nextLine();
                    System.out.print("출금액: ");
                    int withdrawal = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < countOfAcc; i++) {
                        if (accounts[i].getNumber().equals(accNum)) {
                            accounts[i].setBalance(accounts[i].getBalance() - withdrawal);
                        }
                    }

                    System.out.println("결과: 출금이 성공되었습니다.");
                }
                case "5" -> run = false;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
