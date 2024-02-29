package ch05.lecture.p02string;

public class C04CharAt {
    public static void main(String[] args) {
        String a = "son";
        System.out.println(a.charAt(0));    // s
        System.out.println(a.charAt(1));    // o
        System.out.println(a.charAt(2));    // n

        String b = """
                Hello
                World
                """;
        System.out.println(b.charAt(0));    // H
        System.out.println(b.charAt(b.length() - 1));   // 엔터
        System.out.println(b.charAt(6));    // W


    }
}
