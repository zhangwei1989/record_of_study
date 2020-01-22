import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {


    public static void main(String[] args) {
//        Map hm = new ConcurrentHashMap();
        Map hm = new HashMap();
        hm.put(null, "asdf");
        hm.put("asdf", null);

        Object obj = hm.get(1);
        System.out.println(obj);
        System.out.println(hm);
    }
}