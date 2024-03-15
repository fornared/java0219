package ch13.lecture.p01generic;

public class C02GenericType {
    public static void main(String[] args) {
        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();

        box1.setItem("java");
        String item1 = box1.getItem();
        box2.setItem(300);
        Integer item2 = box2.getItem();

    }
}

//  [generic type]
// <>: type parameter

// 타입 파라미터 이름 작성 관습: 대문자 한 글자
// 주로 쓰는 이름들..
// T: Type
// E: Element
// K: Key
// V: Value
// R: Return, Result

// S, U, V, T1, T2...

class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}