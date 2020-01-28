import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {


    public static void main(String[] args) {

        /** with null key and value */
        /*//        Map hm = new ConcurrentHashMap();
        Map hm = new HashMap();
        hm.put(null, "asdf");
        hm.put("asdf", null);

        Object obj = hm.get(1);
        System.out.println(obj);
        System.out.println(hm);*/

        /** pollLastEntry()/pollFirstEntry()/tailMap */
        /*NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");

        System.out.println(mymap);

        System.out.println(mymap.pollLastEntry()); //LINE 1
        System.out.println(mymap);
        System.out.println(mymap.pollFirstEntry()); //LINE 2
        System.out.println(mymap);

        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
        System.out.println(mymap);
        System.out.println(tailmap);

        System.out.println(tailmap.pollFirstEntry()); //LINE 4
        System.out.println(mymap.size()); //LINE 5*/

        /** put */
        Map m = new HashMap();
        System.out.println(m.put("a", null));
        System.out.println(m.put("a", "value1"));
        System.out.println(m.put("a", "value2"));
        System.out.println(m.put("b", "value3"));
    }
}