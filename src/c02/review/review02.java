package c02.review;

public class review02 {
    public static void main(String[] args) {
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


        /*
            [문자열(String)을 기본 타입으로 변환]
        String은 참조 타입이기 때문에 기본 타입으로 변환 시 형변환이 아닌 메소드에 의한 변환 필요
        기본타입 <-> 참조타입 간의 형변환은 불가능
        기본타입 <-> String 간의 변환은 메소드로 가능
         */
        String forStr = "123";
        int toPri = Integer.parseInt(forStr);
        System.out.println("toPri = " + toPri);

        int forPri = 123;
        String toStr = String.valueOf(forPri);
        System.out.println("toStr = " + toStr);
    }
}
