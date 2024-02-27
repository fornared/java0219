package ch03.review;

public class review02 {
    public static void main(String[] args) {
        // String 간의 비교는 equals() 메소드 사용
        String ja = "자";
        String va = "바";
        String java1 = "자바";
        String java2 = ja + va;

        boolean b1 = (java1 == java2);
        boolean b2 = java1.equals(java2);
        System.out.println("== : " + b1);
        System.out.println("equals : " + b2);

        /*
            [논리연산자]
        &&: AND (논리곱)           둘 모두 true 일때만 true , 나머지 false
        ||: OR  (논리합)           둘 중 하나라도 true 면 true, 둘다 false 면 false
        ^ : XOR (배타적 논리합)    둘의 값이 다르면 true, 같으면 false
        ! : NOT (논리 부정)        !a : a의 반대
         */

        /*
            [단락 평가 (short-circuit evaluation)]
        논리연산자 &&는 앞 항이 false 이면 결과는 무조건 false, ||는 앞 항이 true 이면 무조건 true 이기 때문에
        뒤 항을 볼 필요 없이 그대로 연산을 끝내버림
         */
        int num1 = 10;
        int i1 = 1;
        boolean value1 = ((num1 += i1) == 5) && ((i1 += 100) == 50);
        System.out.println("value1 = " + value1 + ", num1 = " + num1 + ", i1 = " + i1);

        int num2 = 10;
        int i2 = 1;
        boolean value2 = ((num2 += i2) == 11) || ((i2 += 100) == 50);
        System.out.println("value2 = " + value2 + ", num2 = " + num2 + ", i2 = " + i2);
    }
}
