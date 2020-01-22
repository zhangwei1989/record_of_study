import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {


    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a0", "b0", "c0", "d0", "e0", "f0", "g0",
                "a1", "b1", "c1", "d1", "e1", "f1", "g1",
                "a2", "b2", "c2", "d2", "e2", "f2", "g2",
                "a3", "b3", "c3", "d3", "e3", "f3", "g3");

        /** reduce */
        String join = vals.parallelStream()
                .peek(System.out::println)
                .reduce("_",
                        (a, b) -> {
                            System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                            return a.concat(b);
                        },
                        (a, b) -> {
                            System.out.println("combining " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
                            return a.concat(b);
                        }
                );
        System.out.println(join);
    }
}