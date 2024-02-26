package ch04.lecture.p04for;

public class C05ForExercise {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*

         *
         **
         ***
         ****
         *****

         */
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*

         *****
         ****
         ***
         **
         *

         */
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

        *****
        ****#
        ***##
        **###
        *####
        #####

         */
//        for (int i = 6; i > 0; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            for (int k = 0; k < 6 - i; k++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        /*

         *
         **
         ***
         ****
         *****

         */
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (4 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

         *****
         ****
         ***
         **
         *

         */
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (5 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

        0
        01
        012
        0123
        01234

         */
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        /*

        1
        12
        123
        1234
        12345

         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        /*

        0
        12
        345
        6789
        01234

         */
//        int k = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(k % 10);
//                k++;
//            }
//            System.out.println();
//        }
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k % 10);
                k++;
            }
            System.out.println();
        }

        System.out.println();

        /*

        1
        23
        456
        7890
        12345

         */

        k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k % 10);
                k++;
            }
            System.out.println();
        }

        System.out.println();
    }
}
