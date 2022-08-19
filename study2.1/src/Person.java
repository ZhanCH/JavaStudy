public class Person {
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this(name,99);
    }

    public Person(){
        this("unKnow",99);
    }

    public void setName_Age(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String secondName) {
        this.name = firstName + secondName;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}