package interview;

import java.util.HashMap;
import java.util.Map;

public class FindPairsOfSocks {
    public static void main(String[] args) {
        //Sock Pair Counter
        //{1,1,2,2,3,1,3,2} --> 3 pairs 1,1 makes one pair 1 left out so not coutable
        int[] arr = {1,1,3,2,1,3,4,2};
       int pairsCount =  findSocksPair(arr);
        System.out.println("sock count:"+ pairsCount);
    }

    private static int findSocksPair(int[] array) {
        int sockPairs = 0;
        Map<Integer, Integer> sockscountMap = new HashMap<>();
        for (int num : array){
            int count = sockscountMap.getOrDefault(num,0);
            count++;
            if (count % 2 == 0){
                sockPairs++;
            }
            sockscountMap.put(num,count);
        }
        return sockPairs;
    }
}
