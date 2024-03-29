package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        //  [방법1]
        Stream<Student> studentStream = list.stream();
        // 중간처리(학생 객체를 점수로 매핑)
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        // 최종처리(평균 점수)
        double avg1 = scoreStream.average().getAsDouble();
        System.out.println("avg1 = " + avg1);

        System.out.println();

        //  [방법2]
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("avg2 = " + avg2);

        System.out.println();

        // 고전적 방법
        double sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        double avg3 = sum / list.size();
        System.out.println("avg3 = " + avg3);
    }
}
