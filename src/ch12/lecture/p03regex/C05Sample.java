package ch12.lecture.p03regex;

import java.util.Arrays;

public class C05Sample {
    public static void main(String[] args) {
        // _, &, 영문 대소문자, 숫자 조합
        // 단, 숫자로 시작하면 안됨

        String pattern = "^(?![0-9])[a-zA-Z0-9]+$";


    }
}
