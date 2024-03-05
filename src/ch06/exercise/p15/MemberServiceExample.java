package ch06.exercise.p15;

import java.util.Scanner;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        String id = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        boolean result = memberService.login(id, password);
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout(id);
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
        sc.close();
    }
}
