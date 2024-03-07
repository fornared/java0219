package ch06.lecture.p07access;

public class C01AccessModifier {
    public static void main(String[] args) {
        // public ~ 다른 클래스에서 접근
        C01MyClass o1 = new C01MyClass();
        o1.age = 30;
    }
}

// 하나의 파일에 하나의 public class만 작성 가능
// public class C01My { }   // error
class C01My {

}

