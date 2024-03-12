package ch04.review;

import java.util.Random;

public class review01 {
    public static void main(String[] args) {
        /*
            [Random]
        Math.random() : 0.0 <= (double 리턴값) < 1.0
        Random(): nextInt(bound)          : 0 <= (int 리턴값) < bound
                  nextInt(origin, bound)  : origin <= (int 리턴값) < bound
         */
        int dice1 = (int) (Math.random() * 6 + 1);

        Random random = new Random();
        int dice2 = random.nextInt(1, 7);

        System.out.println(STR."\{dice1}, \{dice2}");
    }
}
