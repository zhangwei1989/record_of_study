import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {


    public static void main(String[] args) {
        /** SimpleDateFormat */
        /*SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.CHINA);
        System.out.println(sdf.format(new Date()));*/

        /** DateTimeFormatter */
        LocalDate d = LocalDate.now();
        Locale loc = new Locale("zh", "CN");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd, MMMM yyyy", loc);
        System.out.println(df.format(d));
    }
}