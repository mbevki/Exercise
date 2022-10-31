
// 10 - Write a Java regular expression to describe valid IP addresses
// of the form a.b.c.d where each letter can represent 1, 2, or 3 digits,
// and the periods are required.

/**
 *
 * Riješeno
 *
 */
/**
 *
 * Finished
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a IP address: ");
        String userIpAddress = scan.nextLine();;
        //[0-9] for numbers
        //{1,3} minimum 1 char, maximum 3 char
        //[.] for periods
        //put that in ( ) for like a.b.c. and then one more time for d
        Pattern pattern = Pattern.compile("([0-9]{1,3}[.]){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher(userIpAddress);

        if(matcher.matches()){
            System.out.println("IP Address is OK.");
        }else {
            System.out.println("Wrong IP Address!!!");
        }


    }
}
