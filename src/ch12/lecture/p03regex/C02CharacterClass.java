package ch12.lecture.p03regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("A".matches("[abc]"));   // false

        System.out.println("abc".matches("[abc]")); // false
    }
}
