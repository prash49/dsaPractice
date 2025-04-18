package DSAProblems.interviewPrep.mostAsked;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flown", "flow"};
        //flow willbe common prefix
        System.out.println("longest common prefix: " + longestCommonPrefix(strings));
    }

    private static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0){return  "";}
        String prefix = strings[0];
        // loop through the list
        for (int i = 1; i < strings.length; i++) {
            // now we need to check the string prefix index shouldn't be == 0 if == 0 then stop
            while (strings[i].indexOf(prefix) != 0) {
                // we need to loop till i find the prefix length for string 1 and string 2 in each iteration
                //in each iteration we need to take out the prefix so its need for next iteration in while
                prefix = strings[i].substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }

        }
        return prefix;
    }


    String practiceLongestCommonPrefix(String[] list) {
        if (list == null || list.length == 0){return  "";}
        String prefix = list[0];
        for (int i = 1; i < list.length; i++) {
            while (list[i].indexOf(prefix) != 0) {
                prefix = list[i].substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
