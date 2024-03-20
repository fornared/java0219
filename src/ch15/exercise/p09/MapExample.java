package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);


        String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0;   // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        //
        Set<String> keys = map.keySet();

        for (String key : keys) {
            if (maxScore < map.get(key)) {
                name = key;
                maxScore = map.get(key);
            }
            totalScore += map.get(key);
        }

        int avgScore = totalScore / map.size();
        System.out.println(STR."평균 점수: \{avgScore}");
        System.out.println(STR."최고 점수: \{maxScore}");
        System.out.println(STR."최고 점수를 받은 아이디: \{name}");
        //

        // 1748 1512 2006 2206 2363
        //  [review]
        // ArrayList HashSet HashMap
        // Stack Queue LinkedList
    }
}
