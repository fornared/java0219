package ch13.lecture.p01generic;

public class C05PolyMorphism {
    public static void main(String[] args) {
        C05Box<Number> box1 = new C05Box<>();
        C05Box<Integer> box2 = new C05Box<>();
        C05Box<Double> box3 = new C05Box<>();

        box1.someMethod();
        box2.someMethod();
        box3.someMethod();
    }
}

// 제한된 타입 파라미터
class C05Box<T extends Number> {
    private T item;

    public void someMethod() {
        item.intValue();
    }
}
