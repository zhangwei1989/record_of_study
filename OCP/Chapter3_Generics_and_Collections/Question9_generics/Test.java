import java.util.*;
import java.util.function.*;

class Person {

    private String id = "0";

    private String interest = "0";

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getInterest() {
        return interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

/** generic class and method with same name */
/*class Counter<T> {
    T t;

    public <T> int count(T[] ta, T t) {
        this.t = t;
        int count = 0;
        for (T x: ta) {
            count = x == t ? count + 1 : count;
        }

        return count;
    }
}*/

public class Test {

    public void helpPeople(Queue people, Queue helped) {
        do {
            Person p = (Person) people.poll();
            System.out.println("Helped : " + p + " ");
            helped.offer(p.getName());
        } while (!people.isEmpty());
    }

    public static void main(String[] args) {
        /** 声明时还有范型 */
        Queue<Person> q = new LinkedList<>();
        q.offer(new Person("Pope"));
        q.offer(new Person("John"));
        Queue<Person> helperQ = new LinkedList<>();
        Test t = new Test();
        t.helpPeople(q, helperQ);
    }
}