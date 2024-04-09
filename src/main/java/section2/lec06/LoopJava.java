package section2.lec06;

import java.util.Arrays;
import java.util.List;

public class LoopJava {
    public static void main(String[] args) {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (long number : numbers) {
            System.out.println(number);
        }


        //i가 올라갈때
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        //i 가 내려갈때
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }

        //2 칸씩 올라갈때
        for (int i = 1; i<=5; i+=2) {
            System.out.println(i);
        }
    }
}