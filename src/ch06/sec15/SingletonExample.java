package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();   // error (private access)

        //정적 메소드를 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(obj1));
        System.out.println(System.identityHashCode(obj2));

        System.out.println(obj1 == obj2);   // true
    }
}
