package ch08.lecture.p01interface;

public class C01Interface {
    // [인터페이스]
    // 구현 클래스가 여러 인터페이스를 구현할 수 있다
    // 모든 메소드는 public abstract 메소드
    // 인스턴트 필드 없음
    // public static final 필드만 작성 가능

    // [추상 클래스]
    // 자식 클래스의 부모 클래스는 하나
    // 추상 메소드와 구현된 메소드 모두 작성 가능
    // 접근제한자 4개 모두 사용 가능
    // 인스턴트 필드 가질 수 있음


    public static void main(String[] args) {
        C01ConcreteClass o1 = new C01ConcreteClass();
        C01MyInterface o2 = o1;

    }
}

interface C01MyInterface {

}

class C01ConcreteClass implements C01MyInterface {

}