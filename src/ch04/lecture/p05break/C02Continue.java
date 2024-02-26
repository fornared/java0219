package ch04.lecture.p05break;

public class C02Continue {
    public static void main(String[] args) {
        // continue: 코드블럭 내의 코드 실행을 중단하고
        //           반복문의 조건 확인으로 흐름이 넘어감

        boolean b = true;
        while (b) {
            System.out.println("statement1");

            System.out.println("statement2");
//            continue;     // error
            System.out.println("statement3");
        }
    }
}
