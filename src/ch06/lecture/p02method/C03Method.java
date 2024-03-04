package ch06.lecture.p02method;

public class C03Method {
    public static void main(String[] args) {
        C03Person john = new C03Person();
        C03Person jane = new C03Person();

        john.name = "john";
        jane.name = "jane";
    }
}

class C03Person {
    String name;

    void run() {
        System.out.println(name + "이 달립니다.");
    }

    void walk() {
        System.out.println(name + "이 걷습니다.");
    }
}