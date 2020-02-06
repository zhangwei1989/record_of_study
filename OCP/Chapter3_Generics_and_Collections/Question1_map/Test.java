import java.util.*;
import java.util.function.*;
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
        /*Map m = new HashMap();
        System.out.println(m.put("a", null));
        System.out.println(m.put("a", "value1"));
        System.out.println(m.put("a", "value2"));
        System.out.println(m.put("b", "value3"));*/

        /** merge */
        /*Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "123456789");
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1: v2;
        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
        jenny = favorites.merge("Jenny", "Skyride", mapper2);
        tom = favorites.merge("David", "Skyride", mapper2);
        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}*/

        /** computIfPresent */
        Map<String, Integer> favorites = new HashMap<>();
        favorites.put("a", 7);
        favorites.put("b", 10);
        favorites.put("c", 110);
        favorites.put("d", null);

        /*BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
        BiFunction<String, Integer, Integer> mapper2 = (k, v) -> null;
        Integer a = favorites.computeIfPresent("a", mapper);
        System.out.println(a);
        Integer b = favorites.computeIfPresent("b", mapper);
        System.out.println(b);
        b = favorites.computeIfPresent("b", mapper2);
        System.out.println(b);
        Integer d = favorites.computeIfPresent("d", mapper);
        System.out.println(d);
        d = favorites.computeIfPresent("d", mapper2);
        System.out.println(d);
        Integer e = favorites.computeIfPresent("e", mapper);
        System.out.println(e);
        System.out.println(favorites);*/
        
        /** computeIfAbsent */
        Function<String, Integer> mapper = (k) -> 1;
        Integer a = favorites.computeIfAbsent("a", mapper);
        System.out.println(a);
        System.out.println(favorites);

        Integer d = favorites.computeIfAbsent("d", mapper);
        System.out.println(d);
        System.out.println(favorites);

        Integer e = favorites.computeIfAbsent("e", mapper);
        System.out.println(e);
        System.out.println(favorites);

        favorites.put("d", null);
        Function<String, Integer> mapper2 = (k) -> null;

        d = favorites.computeIfAbsent("d", mapper2);
        System.out.println(d);
        System.out.println(favorites);

        Integer f = favorites.computeIfAbsent("f", mapper2);
        System.out.println(f);
        System.out.println(favorites);
    }
}