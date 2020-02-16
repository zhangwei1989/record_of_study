public class Test {

    public static void main(String[] args) {
        /** Random */
        Random r = new Random();
        System.out.println(r.doubles(10));
        r.doubles(10).forEach(System.out::println);

        DoubleStream rDoubles = r.doubles().limit(10);
        rDoubles.forEach(System.out::println);

        DoubleStream.generate(r::nextDouble).limit(10).forEach(System.out::println);

    }
}
