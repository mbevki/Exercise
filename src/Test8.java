
//  8 - Write a Java program to reverse every word in a string using methods.
//
//        Sample Output:
//
//        The given string is: This is a test string
//        The string reversed word by word is:
//        sihT si a tset gnirts
/**
 *
 * Finished
 *
 */
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        String sentence = "This is a test string";
        System.out.println(sentence);
        String reverseSentence = Arrays.asList(sentence.split(" "))
                .stream()
                .map(reverseWords -> new StringBuilder(reverseWords).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseSentence);
    }
}
