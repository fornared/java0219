package ch09.lecture.p02anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO: null 대신 익명클래스 객체 코드 작성
        Random random = new Random();

        Game rpsGame = new Game() {
            @Override
            public void play() {
                int num = random.nextInt(1, 4);
                switch (num) {
                    case 1 -> System.out.println("가위");
                    case 2 -> System.out.println("바위");
                    case 3 -> System.out.println("보");
                }
            }
        };
        // "가위", "바위", "보" 중 하나 출력
        rpsGame.play();

        Game lottoGame = new Game() {
            @Override
            public void play() {
                int[] arr = new int[6];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(1, 46);
                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            i--;
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
        };
        // 초보자: 1~45 값 중 한 개 출력
        // 중급자: 1~45 값 중 6개 중복없이 출력
        lottoGame.play();
    }
}


interface Game {
    void play();
}