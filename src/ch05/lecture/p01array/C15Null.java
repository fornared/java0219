package ch05.lecture.p01array;

public class C15Null {
    public static void main(String[] args) {
        // null: 참조하는 객체가 없다
        // null의 속성, 메소드를 사용시 예외 발생

        int[] arr1 = {2, 3, 4};
        System.out.println(System.identityHashCode(arr1));

        int[] arr2 = null; // arr2 참조변수가 참조하는 객체가 없음
        System.out.println(System.identityHashCode(arr2));

        System.out.println(arr1.length);
        // System.out.println(arr2.length);  // exception

        arr1 = null;
        System.out.println(System.identityHashCode(arr1));
    }
}
