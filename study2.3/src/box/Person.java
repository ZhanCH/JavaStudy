package box;
public class Person {
    private String name;
    private int age;
    public static int number;

    public static void run(Person a) {
        System.out.println(a.name);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
