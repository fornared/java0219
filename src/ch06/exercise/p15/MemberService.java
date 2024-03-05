package ch06.exercise.p15;

public class MemberService {
    boolean login(String id, String password) {
//        boolean result = id.equals("hong") && password.equals("12345");
//        return result;
        return id.equals("hong") && password.equals("12345");
    }

    void logout(String id) {
        System.out.println(STR."\{id}님이 로그아웃 되었습니다.");
    }
}
