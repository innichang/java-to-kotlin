package section4.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaCollection {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(100, 200);

        //하나를 가져오기
        System.out.println(numbers.get(0));

        //For Each
        for (int number : numbers) {
            System.out.println(number);
        }

        //전통적인 For문
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s ", i, numbers.get(i));
        }
    }

    public void map() {
        //JDK 8까지
        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        //JDK 9 +
//        Map.of(1, "MONDAY", 2, "TUESDAY");
    }
}
