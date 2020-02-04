import java.util.*;
import java.text.SimpleDateFormat;

public class Test {


    public static void main(String[] args) {
        /** SimpleDateFormat */
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.CHINA);
        System.out.println(sdf.format(new Date()));
    }
}