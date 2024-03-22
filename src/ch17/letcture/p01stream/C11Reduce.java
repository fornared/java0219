package ch17.letcture.p01stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {
        // reduce: reduction 최종 연산

        List<String> list1 = List.of("java", "css", "spring", "html");

        // "javacssspringhtml"
        String result1 = "";
        for (String s : list1) {
            result1 += s;
        }
        System.out.println(result1);

        List<Integer> list2 = List.of(3, 6, 9, 10);
        int sum1 = 0;
        for (int i : list2) {
            sum1 += i;
        }
        System.out.println(sum1);

        // stream 활용
        String result2 = list1.stream()
                .reduce("", (result, e) -> result + e);
        System.out.println("result2 = " + result2);

        Integer sum2 = list2.stream()
                .reduce(0, (s, v) -> s + v);
        System.out.println("sum2 = " + sum2);
    }
}
