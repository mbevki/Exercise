
// 1. Take 10 integer inputs from the user and store them in an array.
// Again ask the user to give a number. Then, tell the user whether
// that number is present in the array or not.

/**
 *
 * Finished
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
//      Filling the array with value
        for(int i = 0; i < num.length; i++){
            System.out.print("Enter " +(i+1)+ ". number: ");
            num[i] = scan.nextInt();
        }
//      For test purpose to see the array (can comment out)
        System.out.println("Your array of numbers is: \n\t-> " + Arrays.toString(num));

        System.out.print("Enter a number to find: ");
        int userNum = scan.nextInt();
        boolean isNumFound = false;
//      Search the user Number in the array
        for(int i=0; i<num.length; i++){
            if(userNum == num[i]){
                isNumFound = true;
            }
        }
//      Output if userNum is found in Array or not
        System.out.println(isNumFound ? "\t-> Your number is in array." : "\t-> Your number is not in array.");
    }
}