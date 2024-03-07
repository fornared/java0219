package ch06.sec15;

public class Singleton {
    // private 정적 필드 선언 및 초기화
    private static Singleton singleton = new Singleton();

    // private 생성자 선언
    private Singleton() {
    }

    // public 정적 메소드 선언
    public static Singleton getInstance() {
        return singleton;
    }
}
