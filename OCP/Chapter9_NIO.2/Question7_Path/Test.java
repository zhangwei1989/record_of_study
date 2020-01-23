import java.util.*;
import java.nio.file.*;

public class Test {


    public static void main(String[] args) {

        /** resolve */
        Path p1 = Paths.get("/root/home/test1.pdf");
        Path p2 = Paths.get("/test1.pdf");

        System.out.println(p1.resolve(p2));
    }
}