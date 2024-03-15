package ch12.lecture.p03regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        // ^(carret): 시작
        // $: 끝

        String s = ",,abc,def,,,xyz,,,_";

        String s1 = s.replaceAll(",", "");
        System.out.println("s1 = " + s1);

        String s2 = s.replaceAll(",+", "T");
        System.out.println("s2 = " + s2);

        String s3 = s.replaceAll("^", "hi");
        System.out.println("s3 = " + s3);

        String s4 = s.replaceAll("$", "bye");
        System.out.println("s4 = " + s4);

        String s5 = s.replaceAll("^,+", "g");
        System.out.println("s5 = " + s5);


    }
}
