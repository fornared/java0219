package ch02.lecture.p02type;

public class C22TypeConversion {
    public static void main(String[] args) {
        // p74-05
        byte byteValue1 = 10;
        char charValue1 = 'A';

        int intValue1 = byteValue1;
        int intValue2 = charValue1;
//        short shortValue = charValue; //error
        double doubleValue1 = byteValue1;

        // p74-06
        int intValue3 = 10;
        char charValue2 = 'A';
        double doubleValue2 = 5.7;
        String strValue1 = "A";

        double var1 = (double) intValue3;
        byte var2 = (byte) intValue3;
        int var3 = (int) doubleValue2;
//        char var = (char) strValue;   //error
        // char: 원시타입 / String: 참조타입
    }
}
