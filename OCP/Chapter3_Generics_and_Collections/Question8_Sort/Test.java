import java.util.*;
import java.util.function.*;

class Person {

    private String id = "0";

    private String interest = "0";

    public Person(String interest) {
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }
}

public class Test {

    String name = "MATH";
    TreeSet<Person> treeSet = new TreeSet<Person>();

    public void add(Person p) {
        if (name.equals(p.getInterest())) {
            treeSet.add(p);
        }
    }

    public static void main(String[] args) {
        /** 没有实现 Comparable */
        /** TreeSet */
        /*Test test = new Test();
        test.add(new Person("MATH"));
        System.out.println("A");
        test.add(new Person("MATH"));
        System.out.println("B");
        System.out.println(test.treeSet);*/

        /** List */
        /*List<Person> people = Arrays.asList(new Person("a"), new Person("b"), new Person("c"));
        Collections.sort(people);*/

        /** max */
        System.out.println(Integer.max(3, 4));
        System.out.println(Integer.compare(3, 9));
        System.out.println(Integer.compare(9, 7));
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
        System.out.println(ls.stream().max(Integer::max).get());
        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max((a, b) -> {
            System.out.println("a: " + a + "b: " + b); return a > b ? a : b;}));
    }
}