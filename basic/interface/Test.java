interface Eatable {
    int types = 10;
}

class Food implements Eatable {
    public static int types = 20;
}

public class Test extends Food implements Eatable {

    public static void main(String[] args) {
        Test test = new Test();
//        types = 30;
        System.out.println(Eatable.types);
        System.out.println(test.types);
    }
}
