package stringProblems;

public class StringRemoveAChar {

    /*TODO write a program to remove a from Prashanth using recurssion*/
    public static void main(String[] args) {
        String original = "Prashanth";
       String output = "";
        System.out.println(skipChars(original));

//        String oringinal2 = "ABCDAPPLE";
//        String skipString = "APPLE";
//        System.out.println(skipStringStartsWith(oringinal2, skipString));
//        System.out.println(skipStringStartsWithAndNotSkip("imPrashaappe", "app"));
    }
    static String skipChars(String original){
        if(original.isEmpty()){
            return "" ;
        }
        char ch = original.charAt(0);
        if(ch == 'a'){
           return skipChars(original.substring(1));
        } else {
          return ch + skipChars(original.substring(1));
        }
    }

    static String skipStringStartsWith(String orinalString, String skipString){
        if(orinalString.isEmpty()){
            return "";
        }
        if(orinalString.startsWith(skipString)){
            return  skipStringStartsWith(orinalString.substring(skipString.length()), skipString);
        }else{
            return  orinalString.charAt(0) + skipStringStartsWith(orinalString.substring(1), skipString);
        }
    }

    // skip some chars only when its not eqaul to given string skip app when its not apple

    static String skipStringStartsWithAndNotSkip(String orinalString, String skipString){
        if(orinalString.isEmpty()){
            return "";
        }
        if(orinalString.startsWith(skipString) && !orinalString.startsWith("apple")){
            return  skipStringStartsWithAndNotSkip(orinalString.substring(skipString.length()), skipString);
        }else{
            return  orinalString.charAt(0) + skipStringStartsWithAndNotSkip(orinalString.substring(1), skipString);
        }
    }
}
