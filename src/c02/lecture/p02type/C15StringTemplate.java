package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        String name = "Jane", age = "50";

        System.out.printf("my name is %s and age is %d\n", "jane", 50);

        String desc1 = "my name is " + name + " and age is " + age;
        System.out.println(desc1);

        String desc2 = String.format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}";
        System.out.println(desc3);
    }
}
