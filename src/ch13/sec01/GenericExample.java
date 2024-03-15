package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
//        Box<String> box1 = new Box<String>();
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);

//        Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();
        box2.content = 100;     // auto boxing
        int value = box2.content;   // auto unboxing
        System.out.println(value);

        // 기본 타입으로 타입파라미터 값 사용 못함
//        Box<int> box3 = new Box<>();
    }
}
