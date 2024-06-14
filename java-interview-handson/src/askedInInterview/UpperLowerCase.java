package askedInInterview;

import java.util.stream.Collectors;

/*
Given string for example "InTErViEw"
convert Character in upper to lower and lower once to upper
eg: Input : "InTErViEw" , Output: "iNteRvIeW"
* */
public class UpperLowerCase {

    public static void main(String[] args) {
        String str = "InTErViEw";

        String output = str.chars().mapToObj(value -> {
                    char c = (char) value;
                    if (Character.isUpperCase(c)) {
                        return Character.toLowerCase(c);
                    } else if (Character.isLowerCase(c)) {
                        return Character.toUpperCase(c);
                    }
                    return c;
                }).map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(output);

    }
}
