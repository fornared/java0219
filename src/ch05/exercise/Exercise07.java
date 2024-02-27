package ch05.exercise;

public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 9};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }
}
