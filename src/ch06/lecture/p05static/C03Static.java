package ch06.lecture.p05static;

import java.util.Arrays;

//  [static import]
// 클래스명을 생략하고 클래스 멤버를 사용 가능하게 함
//import static java.util.Arrays.fill;
//import static java.util.Arrays.copyOf;

import static java.util.Arrays.*;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        fill(brr, 100);     //Arrays.fill()

        int[] crr = copyOf(arr, arr.length);    // Arrays.copyOf()
    }
}
