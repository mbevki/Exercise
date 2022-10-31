
// 4 - Implement a method that finds the position of a String inside an ArrayList<String>.
// It shall return the position of the element (where 0 means the 1st element, 1 the 2nd, and so on).
// In case the element searched is not present in the ArrayList, the method shall return -1.
//
// public static int findValue(ArrayList<String> values, String x) {
//        // Return the position of `x` inside `values`,
//        // return -1 if `x` is not found
//        }
//        NOTE: this method actually exists and it’s called indexOf(). But you can not use it.
/**
 *
 * Finished
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>();

        values.add("Matija");
        values.add("Ivan");
        values.add("Valentina");
        values.add("Igor");
        values.add("Nikolina");

        System.out.println(values);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value(name): ");
        String x = scan.nextLine();

        System.out.println("Result: " + findValue(values, x));

    }
    public static int findValue(ArrayList<String> values, String x) {
        // Return the position of `x` inside `values`,
        if(values.contains(x)){
            for(int i = 0; i<values.size(); i++){
                if(values.get(i).equals(x)){
                    return i + 1;
                }
            }
        }
        // return -1 if `x` is not found
        return -1;
        }
}






