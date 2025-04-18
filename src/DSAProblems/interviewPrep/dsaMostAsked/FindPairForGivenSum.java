package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.*;

public class FindPairForGivenSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, -1);
        int sum = 6;
        System.out.println("pairs: " + findTheNumberOfPairs(list, sum));
    }

    private static int findTheNumberOfPairs(List<Integer> list, int sum) {
        int pairs = 0;
        Map<Integer, Integer> intCountMap = new HashMap<>();
        for (Integer integer : list) {
            int compliment = sum - integer;
            if (intCountMap.containsKey(compliment)) {
                pairs += intCountMap.get(compliment);
            } else {
                intCountMap.put(integer,intCountMap.getOrDefault(integer, 0)+1);
            }
            System.out.println(intCountMap);
        }
        return pairs;
    }
}
