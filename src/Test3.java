
// 3 - Remove words too short from an ArrayList of words
//
//     Let the user choose how many words they want to input
//     Read that many words from the user
//     Let the user choose a number bigger than 0
//     Remove all words from the ArrayList that are shorter than the given number
//
//     To implement the exercise, introduce a method with the following signature:
//
//      public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
//
//        }
/**
 *
 * Finished
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many words do you want to input: ");
        int userNumWords = scan.nextInt();
        scan.nextLine(); // for removing input after INT (enter(\n) or something else)

        ArrayList<String> listOfWords = new ArrayList<>();

        for(int i = 0; i < userNumWords; i++){
            System.out.print("Enter " + (i+1) + " word: ");
            listOfWords.add(scan.nextLine());
        }


        int userRemoveWords;
        do {
            System.out.print("Choose a number (Bigger than 0): ");
            userRemoveWords = scan.nextInt();
        } while (userRemoveWords <= 0);

        System.out.println("After removing we are left with: \n\t->" + removeShortWords(listOfWords, userRemoveWords));


    }
    public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) {
        String[] tmpArray = words.toArray(new String[0]);
        System.out.println("Before removing: \n\t->" + Arrays.toString(tmpArray));

        for(int i = 0; i< tmpArray.length; i++){
            if(tmpArray[i].length() < minLength){
                words.remove(tmpArray[i]);
            }
        }

        return words;
    }
}
