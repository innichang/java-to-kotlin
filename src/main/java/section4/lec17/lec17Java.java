package section4.lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lec17Java {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_500),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 3_200),
                new Fruit("바나나", 2_500),
                new Fruit("수박", 10_000)
        );

        String targetFruitName = "바나나";
        targetFruitName = "수박";
//        filterFruits(fruits, (fruit) -> targetFruitName.equals(fruit.getName()));

        /*Variable used in lambda expression should be final or effectively final
        Java에서는 람다를 쓸 때 사용할 수 있는 변수에 제약이 있다!
         */


    }

    private List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.test(fruit)) {
                results.add(fruit);
            }
        }

        return results;
    }
}
