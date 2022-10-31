
//6 - Print which day of the week is today.
/**
 *
 * Finished
 *
 */
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Test6 {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate.getDayOfWeek());
    }
}
