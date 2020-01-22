import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {


    public static void main(String[] args) {
        Map hm = new HashMap();
        hm.put("a", 1);

        /** remove */
        /*System.out.println(hm.remove("asdf", 2));
        System.out.println(hm);

        System.out.println(hm.remove("asdf", 1));
        System.out.println(hm);

        hm.put("b", 2);
        System.out.println(hm.remove("c"));
        System.out.println(hm);

        System.out.println(hm.remove("b"));
        System.out.println(hm);*/

        /** replace */
        System.out.println(hm.replace("b", 1, 2));
        System.out.println(hm);

        System.out.println(hm.replace("a", 3, 2));
        System.out.println(hm);

        System.out.println(hm.replace("a", 1, 2));
        System.out.println(hm);
    }
}