import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class Test {


    public static void main(String[] args) {

//        Path p1 = Paths.get("test1.pdf");
        /** resolve */
        /*Path p1 = Paths.get("/root/home/test1.pdf");
        Path p2 = Paths.get("/test1.pdf");

        System.out.println(p1.resolve(p2));*/

        /** getName()/subPath() */
        Path p1 = Paths.get("/root/home/second/test1.pdf");
        System.out.println(p1.getRoot());
        System.out.println(p1.getName(0));
        System.out.println(p1.getName(1));
        System.out.println(p1.getName(2));
        System.out.println(p1.getName(3));
//        System.out.println(p1.getName(4));
//        System.out.println(p1.getName(5));
//        System.out.println(p1.getName(-5));

        System.out.println(p1.subpath(0,1));
        System.out.println(p1.subpath(0,2));
        System.out.println(p1.subpath(0,3));
//        System.out.println(p1.subpath(0,5));
//        System.out.println(p1.subpath(5,4));
//        System.out.println(p1.subpath(-1,4));


        /** BufferedReader */
        /*try (BufferedReader bfr = Files.newBufferedReader(p1, Charset.forName("US-ASCII"))) {

        } catch (Exception e) {
            System.out.println(e);
        }*/

    }
}