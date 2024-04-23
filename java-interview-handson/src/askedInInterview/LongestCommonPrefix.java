package askedInInterview;

import java.util.Arrays;

public class LongestCommonPrefix {


    /*Find Longest common Prefix in an array
                        [“amazon”, “amazed”, “amaze”, “amazing”, “amazes”]*/
    public static void main(String[] args) {
        String words[] = {"amazon", "amazed", "amaze", "amazing", "amazes"};

        String output = getLongestCommonPrefixJava8(words);
        System.out.println(output);
    }

    private static String getLongestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            String current = words[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }
        return prefix;
    }

    private static String getLongestCommonPrefixJava8(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
       return Arrays.stream(words).reduce((s1, s2) -> {
           int i=0;
           while (i < s1.length() && i< s2.length() && s1.charAt(i) == s2.charAt(i)) {
               i++;
           }
                   return s1.substring(0,i);
       }).orElse("");
    }
}
