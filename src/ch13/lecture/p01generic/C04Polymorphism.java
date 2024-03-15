package ch13.lecture.p01generic;

public class C04Polymorphism {

}

class C04Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void someMethod() {
        // Object의 메소드 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));
    }
}
