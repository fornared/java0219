package ch16.lecture.p01lambda;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.compare;

public class C15Sort {
    public static void main(String[] args) {
        String[] names = {"son", "kwang", "alex", "go", "john"};

        System.out.println("정렬전");
        System.out.println(Arrays.toString(names));


    }

    private static void sort(String[] arr, Comparator<String> comparator) {
        int loop = arr.length;

        for (int current = 0; current < loop; current++) {
            String min = arr[current];
            int minIndex = current;

            for (int i = current; i < loop; i++) {
                int result = comparator.compare(min, arr[i]);
                if (result > 0) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            String temp = arr[current];
            arr[current] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
