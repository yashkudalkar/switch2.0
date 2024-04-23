package askedInInterview;

/*
Question
java program print the output as below ?
input- aaeattccc
output- 2a1e1a2t3c
*/


public class CharacterCount {

    public static void main(String[] args) {
        String input = "aaeattccc";
        System.out.println(String.format("input %s", input));
        String outOut = compressedString(input);
        System.out.println(String.format("outOut %s", outOut));
    }

    private static String compressedString(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder outPut = new StringBuilder();
        char prev = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == prev) {
                count++;
            }
            else {
                outPut.append(count).append(prev);
                count=1;
                prev =current;
            }
        }
        outPut.append(count).append(prev);
        return outPut.toString();
    }
}
