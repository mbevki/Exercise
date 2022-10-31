
// 2. Take 10 integer inputs from the user and store them in an array.
// Now, copy all the elements into another array but in reverse order.

/**
 *
 * Finished
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];
//      Filling up the Array with value
        for(int i = 0; i < num.length; i++){
            System.out.print("Enter " +(i+1)+ ". number: ");
            num[i] = scan.nextInt();
        }

        int[] reverseNum = new int[10];
//      Reverse order the Array Num
        for(int i = num.length-1, j=0; i>=0; i--,j++){
            reverseNum[j] = num[i];
        }
//      Or second Version without the "j" in for loop
//        for(int i = num.length-1; i>=0; i--){
//            reverseNum[(num.length-1)-i] = num[i];
//        }

        System.out.println("-> Original Array is: " + Arrays.toString(num));
        System.out.println("-> Reversed Array is: " + Arrays.toString(reverseNum));

//      Or second Version a little bit longer
//        System.out.print("-> Normal order: [");
//        for (int i : num) {
//            System.out.print(i + " ");
//        }
//        System.out.print("]\n-> Reversed order: [");
//        for (int i : reverseNum) {
//            System.out.print(i + " ");
//        }
//        System.out.println("]");

    }
}
