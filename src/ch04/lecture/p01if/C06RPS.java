package ch04.lecture.p01if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        // [가위바위보 게임]
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요. ");

        int userNum = Integer.parseInt(scanner.nextLine());
        String user = asRsp(userNum);
        int comNum = random.nextInt(1, 4);
        String com = asRsp(comNum);

        System.out.println("user: " + user);
        System.out.println("com: " + com);


        if (userNum == comNum) {
            System.out.println("비겼습니다.");
        } else if (userNum == 1) {
            if (comNum == 2) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else if (userNum == 2) {
            if (comNum == 3) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else if (userNum == 3) {
            if (comNum == 1) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        }
    }

    public static String asRsp(int num) {
        String rsp;

        if (num == 1) {
            rsp = "가위";
        } else if (num == 2) {
            rsp = "바위";
        } else {
            rsp = "보";
        }

        return rsp;
    }
}
