package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();   //이륙
        sa.fly();       //일반비행
        sa.flyMode = SupersonicAirplane.SUPERSONIC; //초음속모드로
        sa.fly();       //초음속비행
        sa.flyMode = SupersonicAirplane.NORMAL;     //일반모드로
        sa.fly();       //일반비행
        sa.land();      //착륙
    }
}
