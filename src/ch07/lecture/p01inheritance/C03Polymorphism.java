package ch07.lecture.p01inheritance;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Child1 child1 = new C03Child1();
        C03Parent parent1 = child1;

        C03Parent child2 = new C03Child2();
        C03Parent parent2 = child2;

        C03Parent child22 = new C03Child2();

        C03Parent p1 = new C03Parent();
//        C03Child1 c1 = p1;    // error
    }
}

class C03Parent {
}

class C03Child1 extends C03Parent {
}

class C03Child2 extends C03Parent {
}