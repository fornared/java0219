package ch04.lecture.p05break;

public class C01Break {
    public static void main(String[] args) {
        // for, while, do-while, switch
        // break: 반복문의 코드 블럭에서 break 실행시 반봅문 종료

        boolean b = true;
        while (b) {
            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");
            break;
        }
    }
}
