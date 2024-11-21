package stringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetProblems {
    // TOOD solve subSet problems
    // it involves in permutations and combinations
    // subset is non adjucent collection using recurrsion and
    public static void main(String[] args) {

        String input = "abc";
        //return all the subsets ex: ["a", "b", "c", "ab","ac", "bc", "abc] its not overrie  the sequence of
        //ex it can;t be ca , cb
        // Pattern here is Taking someelelments and removign some elements called
        // subSet patterns
        // write a program to print all subSequence for given string
//        subSequence(input, "");
//       ArrayList<String> stringArrayList = subSequenceArrayList(input, "");
//        System.out.println(stringArrayList);
//        List<Integer> integerList = Arrays.asList(1,2,3);
//        List<Integer> arrayList = new ArrayList<>();
//        subSet(integerList, arrayList);

        System.out.println(subSequenceArrayListReturn(input, "", new ArrayList<>()));
    }

    static void subSequence(String original, String sequence){
        if(original.isEmpty()){
            System.out.println(sequence);
            return;
        }
        char ch = original.charAt(0);
        subSequence(  original.substring(1),   sequence + ch);
        subSequence( original.substring(1), sequence);
    }

    static ArrayList<String> subSequenceArrayList(String original, String sequence) {
        if (original.isEmpty()) {
//            System.out.println(sequence);
            ArrayList<String> list = new ArrayList<>();
            list.add(sequence);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> list1 = subSequenceArrayList(original.substring(1), sequence + ch);
        ArrayList<String> list2 = subSequenceArrayList(original.substring(1), sequence);
        list1.addAll(list2);
        return list1;
    }

    static ArrayList<String> subSequenceArrayListReturn(String original, String sequence, ArrayList<String> arrayList) {
        if (original.isEmpty()) {
//            System.out.println(sequence);
            arrayList.add(sequence);
            return arrayList;
        }
        char ch = original.charAt(0);
        subSequenceArrayListReturn(original.substring(1), sequence + ch, arrayList);
        return subSequenceArrayListReturn(original.substring(1), sequence, arrayList);

    }
    
    static void  subSet(List<Integer> integerList, List<Integer> integer){
        if(integerList.isEmpty()){
            System.out.println(integer);
            return;
        }
        Integer index = integerList.get(0);
        subSet(integerList.subList(1, integerList.size()), integer);
        integer.add(index);
        subSet(integerList.subList(1, integerList.size()),integer );
    } 
}
