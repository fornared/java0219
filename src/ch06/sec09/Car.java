package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자 선언
    Car(String model) {
        this.model = model;
    }

    // 메소드 선언
    void setSpeed(int speed) {
        this.speed = speed;     // 매개변수를 필드에 대입
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달랍니다.(속도: " + this.speed + "km/h)");
    }
}
