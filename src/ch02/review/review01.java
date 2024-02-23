package ch02.review;

public class review01 {
    public static void main(String[] args) {
        /*
            [변수 타입]
        정수: byte, char, short, int, long
        실수: float, double
        논리: boolean
            [타입별 메모리 크기]
        byte    1byte (8bit, -128~127)
        short   2
        char    2   / unicode
        int     4
        long    8
        float   4
        double  8
        boolean 1
        */


        /*
            [부호 있는 정수 타입]
        최상위 bit가 0일 경우 양수, 1일 경우 음수
            [부호화]
        2의 보수 방식 (1의 보수 + 1)
        0000 0001 : 1
        1111 1111 : -1
        0111 1110 : 126
        1000 0010 : -126
        */


        /*
            [정수 리터럴 진수별 작성법]
        2진수: 0b / 0b1011    = 20
        8진수: 0  / 0206      = 134
        10진수:   / 365
        16진수: 0x / 0x2A0f   = 10767
            [타입별 작성법]
        long var1 = 100L;
        char var2 = 'A';
        float var3 = 3.14f;
        String var4 = "가나다";
         */
        char char1 = 'A';
        char char2 = 65;
        char char3 = 0x0041;
        System.out.println(STR."char1: \{char1}, char2: \{char2}, char3: \{char3}");
        double db1 = 5.12e3;    // 5.12 * 10^3  = 5120
        double db2 = 0.34e-2;   // 0.34 * 10^-2 = 0.0034
        System.out.println(STR."db1: \{db1}, db2: \{db2}");
        int x = 10;
        boolean bl1 = (x == 20);    // false
        boolean bl2 = (x != 20);    // true
        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);


        /*
            [이스케이프 문자]
        \" : "
        \\ : \
        \t : tab
        \n : enter
         */


    }
}
