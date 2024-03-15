package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        // 첫 번째는 알파벳, 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 값
        String regExp = "[_$a-zA-Z][_$a-zA-Z0-9]{7,11}";
        boolean isMatch = Pattern.matches(regExp, id);

        if (isMatch) {
            System.out.println("사용할 수 있습니다.");
        } else {
            System.out.println("사용할 수 없습니다.");
        }
    }
}
