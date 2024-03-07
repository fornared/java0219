package ch06.lecture.p06final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.i = 30;
        C04MyClass.i = 50;

//        C04MyClass.k = 200;   //error
    }
}

class C04MyClass {
    // static field
    static int i;

    // final static(상수) field
    // final static field 작명 관습: UPPER_SNAKE_CASE
    final static int K = 100;
    final static int J;
    static final int L = 300;
    final static int AMOUNT_OF_MONEY = 50;

    static {
        J = 200;
    }
}
