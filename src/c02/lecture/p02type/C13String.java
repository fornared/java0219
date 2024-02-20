package c02.lecture.p02type;

public class C13String {
    public static void main(String[] args) {
        // 이스케이프 문자: \ (역슬래시) 사용
        // \n: 줄바꿈 , \t: tab 만큼 띄움 , \": 큰따옴표 , \\ : 역슬래시

        String str = "나는 \t \"자바\"를 배웁니다. \n 번호 \\ 이름 \\ 직업";
        System.out.println("str = " + str);
    }
}
