package string_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
     st = st.toLowerCase();
     String[]strArray=st.split("");
        List<String> duplicateWords =new ArrayList<>();
        HashSet< String> nonRepetitiveWords = new HashSet<>();
        for (String str: strArray)

        {
            if (nonRepetitiveWords.add(st))
                duplicateWords.add(st);
        }
     System.out.println(duplicateWords);

    }
}
