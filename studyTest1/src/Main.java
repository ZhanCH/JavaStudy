import person.Exam;
import person.Person;

public class Main {
    public static void main(String[] args) {

    }

    private void test(Person person){
        if (person instanceof Exam){
            System.out.println("You can do it.");
        }
    }
}
