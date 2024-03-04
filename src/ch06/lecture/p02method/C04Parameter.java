package ch06.lecture.p02method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator calc = new C04Calculator();
        //메소드 호출 시 파라미터에 값(매개값, 인수, argument)을 줘야함
        calc.printSum(5, 7);
        calc.printSum(9, 13);
        calc.printSum(200, 300);

        calc.printDivide(3.14, 0.5);
        calc.printDivide(9.0, 3);
        calc.printDivide(10, 2);
    }
}

class C04Calculator {
    void printSum(int a, int b) {
        int result = a + b;
        System.out.println("result= " + result);
    }

    void printDivide(double a, double b) {
        double result = a / b;
        System.out.println("result = " + result);
    }
}
