package interview;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,6,7,3,4,5,6,9);
        Stream<Integer> skip = nums.stream().sorted(Comparator.reverseOrder()).skip(3);
        Set<Integer> set = new HashSet<>();
        Optional<Integer> firstDuplicateNumber = nums.stream()
                .filter(num -> !set.add(num))
                .findFirst();

        firstDuplicateNumber.ifPresentOrElse( (num) -> System.out.println("duplicate number:"+ num), () -> {
            System.out.println("duplicates not present");
        });

    }
}
