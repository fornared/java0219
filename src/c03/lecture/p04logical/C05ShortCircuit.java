package c03.lecture.p04logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        // || , | : 하나라도 true이면 true
        // || : 앞의 피연산자가 true 이면 뒤의 피연산자를 평가하지 않고 바로 true를 반환
        // | : 항상 두 피연산자를 모두 평가한 뒤 값을 반환
        // ||가 더 효율적이지만 앞의 피연산자가 true일 경우 뒤의 피연산자를 실행하지 않게 됨
        // T || T : true
        // T || F : true
        // F || T : true    // 이 경우는 뒤의 피연산자까지 평가
        // F || F : false


        int i = 10;
        boolean b1 = (i++) == 10 || (i++) == 11;    // true || true
        System.out.println("b1 = " + b1);
        System.out.println("i = " + i);             // 11

        System.out.println("--------------------");
        i = 10;
        boolean b2 = (i++) == 10 || (i++) == 30;    // true || false
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);             // 11

        System.out.println("--------------------");
        i = 10;
        boolean b3 = (i++) == 30 || (++i) == 12;    // false || true
        System.out.println("b3 = " + b3);
        System.out.println("i = " + i);             // 12

        System.out.println("--------------------");
        i = 10;
        boolean b4 = (i++) == 40 || (i++) == 30;    // false || false
        System.out.println("b4 = " + b4);
        System.out.println("i = " + i);             // 12


        System.out.println("--------------------");
        i = 10;
        boolean b5 = (i++) == 10 | (i++) == 30;     // true | false
        System.out.println("b5 = " + b5);
        System.out.println("i = " + i);             // 12
    }
}
