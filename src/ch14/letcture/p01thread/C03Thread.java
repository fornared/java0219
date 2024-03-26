package ch14.letcture.p01thread;

public class C03Thread {
    public static void main(String[] args) {
        // Thread 만들기
        // 1. Thread 클래스 상속
        //    run 메소드 재정의

        // 2. Runnable 인터페이스 구현
        //    run 메소드 재정의


        // Thread 시작하기
        MyThread3 thread = new MyThread3();
        thread.start();

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

// 1. Thread 클래스 상속
//    run 메소드 재정의
class MyThread3 extends Thread {
    @Override
    public void run() {
        // 이 Thread가 할 일
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}