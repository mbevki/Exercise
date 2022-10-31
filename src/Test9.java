
// 9 - Write a Java regular expression to match license plates
// that start with 4 digits and end with two uppercase letters. (ex: 8787AB)
/**
 *
 * Finished
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a license plate (4 numbers and 2 Uppercase letters: ");
        String regPlate = scan.nextLine();

        Pattern pattern = Pattern.compile("[0-9]{4}[A-Z]{2}");
        Matcher matcher = pattern.matcher(regPlate);

        if(matcher.matches()){
            System.out.println("License plate is OK.");
        }else {
            System.out.println("Wrong license plate!!!");
        }
    }
}
