package ch11.letcture.p02throw;

public class C01Throw {
    public static void main(String[] args) {
        // unchecked exception
        RuntimeException e = new RuntimeException();

        // throw: 에외 던지기
        throw e;

//        System.out.println("코드 실행 안됨");
    }
}
