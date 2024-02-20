package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char
        // 2byte == 16bits
        // 0 ~ 65535
        // unicode

        char a = 99;
        char b = 120;
        char c = 65535;
        char d = 33;
        char e = 0x03c8;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int f = 0x1f607;
        char[] emoji1 = Character.toChars(f);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        int g = 0x1F3A4;
        char[] emoji2 = Character.toChars(g);
        String emojit = new String(emoji2);
        System.out.println("emojit = " + emojit);
    }
}
