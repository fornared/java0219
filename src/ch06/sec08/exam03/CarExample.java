package ch06.sec08.exam03;

import java.util.Scanner;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        Scanner sc = new Scanner(System.in);
        System.out.print("gas: ");
        int gas = Integer.parseInt(sc.nextLine());

        // 리턴값이 없는 setGas() 메소드 호출
        myCar.setGas(gas);

        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            // 리턴값이 없는 run 메소드 호출
            myCar.run();
        }

        System.out.println("gas를 주입하세요.");
    }
}
