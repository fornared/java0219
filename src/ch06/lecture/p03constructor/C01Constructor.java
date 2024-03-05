package ch06.lecture.p03constructor;

public class C01Constructor {
    public static void main(String[] args) {
        System.out.println("111111");

        // new 와 생성자 코드 실행으로 객체 생성
        C01MyClass obj1 = new C01MyClass();
        C01MyClass obj2 = new C01MyClass();
        C01MyClass obj3 = new C01MyClass();

        System.out.println("222222");
    }
}

class C01MyClass {
    //  [필드]

    //  [생성자]
    // 객체 생성시 실행되는 코드 블럭
    // 생성자 이름은 클래스 이름과 같아야 함
    // 필요하면 파라미터 작성 가능
    C01MyClass() {
        // 객체 생성시 실행되어야 하는 코드들
        // 보통 필드값 초기화
        // 초기 설정 등
        System.out.println("생성자 호출");
    }

    //  [메소드]
}
