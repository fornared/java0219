package ch07.lecture.p07object;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3);    // 반지름 3
        Shape shape2 = new Rectangle(5, 7); //가로 5, 세로 7
        shape1.printArea(); // 원의 면적 출력 "28.2748"
        shape2.printArea(); // 사각형의 면적 출력 "35"

        printDescription(shape1);   // "반지름이 3인 원의 면적은 28.2748 입니다."
        printDescription(shape2);   // "가로 5, 세로 7인 직사각형의 면적은 35입니다."
    }

    public static void printDescription(Object o) {
        System.out.println(o.toString());
    }
}

abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {
    private final double radius;

    public Round(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."반지름이 \{radius}인 원의 면적은 \{area} 입니다.";
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."가로 \{width}, 세로 \{height}인 직사각형의 면적은 \{area}입니다.";
    }

    public double getArea() {
        double area = width * height;
        return area;
    }
}