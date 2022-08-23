package person;

public abstract class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getname(String name){
        return this.name;
    }

    abstract void eat();
    abstract void sport();
    abstract void study();
}
