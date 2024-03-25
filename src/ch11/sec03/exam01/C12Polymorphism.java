package ch11.sec03.exam01;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
            Integer.parseInt("hundred");
        } catch (NumberFormatException e) {
            System.out.println("코드1");
        } catch (Exception e) {
            // catch 블럭의 순서는 중요함
            System.out.println("코드2");
        }
    }
}
