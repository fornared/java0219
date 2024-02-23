package ch03.lecture.p04logical;

public class C03ExclusiveOr {
    public static void main(String[] args) {
        // ^ (caret): exclusive or (배타적 논리합, XOR)
        // 두 피연산자 값이 다를 때만 true, 같으면 false
        // 피연산자 개수: 2개
        // 피연산자 타입: boolean
        // 연산결과 타입: boolean

        // T^T = false
        // T^F = true
        // F^T = true
        // F^F = false
    }
}
