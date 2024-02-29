package ch05.lecture.p02string;

public class C03Length {
    public static void main(String[] args) {
        String a = "son"; // 길이 3
        String b = "이것이 자바다"; // 길이 7
        String c = """
                hello
                world
                """; // 길이 12

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        
    }
}
