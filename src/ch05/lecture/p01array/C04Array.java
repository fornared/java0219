package ch05.lecture.p01array;

public class C04Array {
    public static void main(String[] args) {
        // 배열: 다수의 같은 타입의 값을 포함하고 있는 하나의 객체
        // 원소의변수타입[] 변수명
        int[] arrInt;
        String[] arrStr;

        arrInt = new int[]{3, 5, 4};
        arrStr = new String[]{"java", "spring", "css"};

        // 다른 타입 원소를 넣을 수 없음
        // arrInt = new int[]{3, 3.14};
        // arrStr = new String[]{"html", 3};

        // 빈 배열
        arrStr = new String[]{};
    }
}
