
// 7 - Create a method to implement the factorial of a number without using recursion.
/**
 *
 * Finished
 *
 */
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Factorial of number " + num + " is " + factorial(num));
    }

    public static int factorial(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
