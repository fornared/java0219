package ch04.lecture.p03while;

public class C01While {
    public static void main(String[] args) {

        boolean condition = false;

        System.out.println("statement1");
        while (condition) {
            System.out.println("statement2");
            System.out.println("statement3");
        }
        System.out.println("statement4");

/*
        while (false) {   //error
            System.out.println("statement2");
            System.out.println("statement3");
        }
        while (true) {    //error
            System.out.println("statement2");
            System.out.println("statement3");
        }
*/

    }
}
