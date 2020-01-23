import java.util.*;
import java.util.function.*;

public class Test {


    public static void main(String[] args) {
        List<String> vals = new ArrayList<>();
        vals.add("a");
        vals.add("b");
        vals.add("c");
        vals.add("d");
        vals.add("e");
        vals.add("f");

        System.out.println(vals);

        /** subList */
        /** subList 有改变后，原来的 list 也能看到变化 */
//        System.out.println(vals.subList(0, 3));
//        System.out.println(vals.subList(4, 3));
//        System.out.println(vals.subList(0, 10));
//        System.out.println(vals.subList(-1, 4));

        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        List<String> view = f.apply(vals);
        view.add("x");
        System.out.println(view);
        System.out.println(vals);
    }
}