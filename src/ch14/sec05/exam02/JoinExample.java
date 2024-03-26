package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();   // sumThread 가 종료되기를 기다림
        } catch (InterruptedException e) {
        }
        System.out.println(STR."1~100 합: \{sumThread.getSum()}");
    }
}
