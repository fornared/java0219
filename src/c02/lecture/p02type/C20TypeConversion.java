package c02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {
        // 정수형: byte(1) < short(2) < int(4) < long(8)
        // 실수형: float(4) < double(8)

        // 작은 타입이 큰타입에 할당 가능
        // 정수형이 실수형에 할당 가능
        byte b = 23;
        int i = b;
//        b = i;  //error

        double d = 233;
        d = i;
        d = b;

        float f = 0;
//        f = d;    //error
        d = f;


        // char는 int 이상에 할당 가느
        char s = '힣';
        int t = s;
//        short u = s;     //error
    }
}

