package c03.lecture.p01arithmetic;

public class C03Overflow {
    public static void main(String[] args) {
        // overflow: 산술 연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻게 됨
        //           overflow를 방지하려면 적절한 데이터 타입을 선택해야 함.

        int a = 2000000000;
        int b = 1000000000;
        int intSum = a + b;       //  -1294967296
        System.out.println("intSum = " + intSum);

        long longSum = (long) a + (long) b;     // 3000000000
        System.out.println("longSum = " + longSum);
    }
}
