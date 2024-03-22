package ch17.letcture.p03optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {
        //  [Optional]
        // null이 아닌 값을 포함할 수 있는 컨테이너

        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(3);
        Optional<Double> d = Optional.of(3.14);
//        Optional<Object> o = Optional.of(null);   // Exception

        Optional<Object> container1 = Optional.empty();

        // 값이 있는지?
        boolean b1 = s.isPresent();           // true
        boolean b2 = container1.isPresent();  // false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // 값이 없는지?
        boolean b3 = s.isEmpty();           // false
        boolean b4 = container1.isEmpty();  // true
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        // 값을 꺼내기
        String s1 = s.get();
        Integer i1 = i.get();
        Double d1 = d.get();
//        Object o = container1.get();  // Exception

        // 값이 없을 땐 기본값 꺼내기
        String s2 = s.orElse("");   // "java"
        Integer i2 = i.orElse(0);   // 3
        Object o2 = container1.orElse(new Object());    // 정상 실행됨


        System.out.println("종료");
    }
}
