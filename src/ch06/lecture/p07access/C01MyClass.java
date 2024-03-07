package ch06.lecture.p07access;

public class C01MyClass {
    // access modifier (접근 제한자, 접근 제어자)
    // 멤버(필드, 메소드)
    // 생성자, 클래스

    // public: 모든 곳에서 접근 가능(가장 넓은 범위)
    // protected: 같은 패키지 + 상속 받은 경우 다른 패키지여도 접근 가능
    // (아무것도 붙지 않음 - package private, default): 같은 패키지 내에서 접근 가능
    // private: 클래스 내에서만 접근 가능(가장 좁은 범위)

    // public field
    public int age;

    // package private field
    String name;
    // private field
    private String address;

    void method1() {
        // public ~ 같은 클래스 내 접근
        System.out.println(age);
        // private ~ 같은 클래스 내 접근
        System.out.println(address);
        // (package private) ~ 같은 클래스 내 접근
        System.out.println(name);
    }


}
