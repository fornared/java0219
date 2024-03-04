package ch05.lecture.p02string;

import java.util.Arrays;

public class C10Split {
    public static void main(String[] args) {
        // split(): 문자열을 주어진 정규 표현식(regular expression)과 일치하는 부분을 기준으로 분리

        String str1 = "hello world";
        String[] words1 = str1.split(" ");

        System.out.println(words1.length);  // 2
        System.out.println(words1[0]);  // hello
        System.out.println(words1[1]);  // world

        String str2 = "css, react, html, spring";
        String[] words2 = str2.split(",");
        System.out.println(Arrays.toString(words2));

        String str3 = "spring";
        String[] words3 = str3.split("");
        System.out.println(Arrays.toString(words3));

        String str4 = "HTML,css, react";
        String[] words4 = str4.split(",\\s*");
        System.out.println(Arrays.toString(words4));

        String str5 = "spring";
        String[] words5 = str5.split("");
        Arrays.sort(words5);
        System.out.println(Arrays.toString(words5));
    }
}
