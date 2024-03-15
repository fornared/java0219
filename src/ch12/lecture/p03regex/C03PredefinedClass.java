package ch12.lecture.p03regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // [0-9] : \d
        // whitespace: \s
        // word character [a-zA-Z0-9_]: \w
        // 모든 문자: .

        String p1 = "\\d";
        System.out.println("0".matches(p1)); // true
        System.out.println("5".matches(p1)); // true
        System.out.println("a".matches(p1)); // false
        System.out.println("012".matches(p1)); // false

        System.out.println(" ".matches("\\s"));

        String str = "손 흥민";
        String s = str.replaceAll("\\s", "");
        System.out.println(s);
    }
}
