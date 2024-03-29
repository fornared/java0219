package ch17.letcture.p01stream;

import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {
        // sorted: 정렬된 stream 리턴
        List<Integer> list = List.of(9, 3, 10, 6, 5, 7, 3, 9, 10);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        List<String> list1 = List.of("java", "css", "react", "html");

        list1.stream()
                .sorted()
                .map(e -> e.length())
                .forEach(System.out::println);

        System.out.println();
        list1.stream()
                .sorted()
                .map(e -> e.length())
                .forEach(System.out::println);
    }
}
