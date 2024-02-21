package c02.review;

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


        /*
            [자동 타입 변환]
        범위가 큰 변수 타입에 작은 변수 타입을 대입하는 경우 ( 큰타입 = 작은타입 )

            [강제 타입 변환 (casting)]
        범위가 작은 변수 타입에 큰 변수 타입을 대입하는 경우 ( 작은타입 = (작은타입) 큰타입 )
         */
        byte byteValue1 = 10;
        int intValue1 = byteValue1;
        System.out.println("intValue1 = " + intValue1);

        int intValue2 = 10;
        byte byteValue2 = (byte) intValue2;
        System.out.println("byteValue2 = " + byteValue2);

        double doubleValue = 3.14;
        long longValue = (long) doubleValue;    // 실수 타입은 정수 타입보다 항상 범위가 크기 때문에 강제변환 필요
        System.out.println("longValue = " + longValue);

        /*
            [연산식에서 타입 변환]
        정수 타입 변수끼리의 연산은 int로 자동 타입 변환되어 연산 수행 (단, int 허용범위보다 클 경우 long 으로 자동변환)

         */
        byte byteX = 10;
        byte byteY = 20;
//        byte result = byteX + byteY;  //error
        int result1 = byteX + byteY;

        float result2 = 1.2f + 3.4f;    // result2 = 4.6f;

        int intX = 10;
        double doubleY = 5.5;
        double result3 = intX + doubleY;    // intX가 10.0으로 자동변환 후 연산
        System.out.println("result3 = " + result3);
        int result4 = intX + (int) doubleY;  // int 결과값이 필요한 경우 강제 변환 필요
        System.out.println("result4 = " + result4);

        int intX2 = 1;
        int intY2 = 2;
        double dbrs0 = intX2 / intY2;     // 0.0
        System.out.println("dbrs0 = " + dbrs0);
        double dbrs1 = (double) intX2 / intY2;
        double dbrs2 = intX2 / (double) intY2;
        double dbrs3 = (double) intX2 / (double) intY2;
        System.out.println("dbrs1 = " + dbrs1);
        System.out.println("dbrs2 = " + dbrs2);
        System.out.println("dbrs3 = " + dbrs3);
        double dbrs4 = (double) (intX2 / intY2);        // x / y 를 먼저 계산하기 때문에 0.0이 됨
        System.out.println("dbrs4 = " + dbrs4);
    }
}
