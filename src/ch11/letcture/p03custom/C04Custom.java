package ch11.letcture.p03custom;

public class C04Custom {
    public static void main(String[] args) throws LackOfCaffeineException {
        method1();
    }

    public static void method1() throws LackOfCaffeineException {
        throw new LackOfCaffeineException("카페인 부족");
    }
}

class LackOfCaffeineException extends Exception {
    LackOfCaffeineException() {

    }

    LackOfCaffeineException(String message) {
        super(message);
    }
}
