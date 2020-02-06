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
        List<Person> people = Arrays.asList(new Person("a"), new Person("b"), new Person("c"));
        Collections.sort(people);
    }
}