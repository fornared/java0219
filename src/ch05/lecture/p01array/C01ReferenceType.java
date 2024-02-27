package ch05.lecture.p01array;

public class C01ReferenceType {
    public static void main(String[] args) {
        // 참조 타입(reference type): 기본 타입(primitive type) 8개 외의 모든 데이터 타입
        //
        int a = 3;
        int b = 3;
        System.out.println(a == b);     // true
        // 배열(array): 여러 값을 갖는 타입
        int[] arr1;
        arr1 = new int[]{3, 4, 5};
        int[] arr2;
        arr2 = new int[]{3, 4, 5};
        System.out.println(arr1 == arr2);   // false
    }
}
