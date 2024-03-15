package ch12.lecture.p03regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n}: 정확히 n번
        // {n,m}: n~m번
        // {n, }: n번 이상
        // +: {1, }: 1번 이상
        // *: {0, }: 0번 이상
        // ?: {0, 1}:한번 또는 없음


        //
        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-5678".matches(p2));

        // {n, m}
        String p3 = "[가-힇]{2, 4}";

        // 영문 대소문자와 한글 한글자 이상
        String p5 = "[a-zA-Z가-힇]{1, }";
    }
}
