public class Main {
    public static void main(String[] args) {
        //person
        Person ming = new Person();
        ming.setName_Age("xiaoming", 20);
        System.out.println("name:" + ming.getName() + "\t" + "age:" + ming.getAge());
        //house
        House first = new House("while", 123);
        System.out.println("HouseColor:" + first.getColor() + "\t" + "HousePrice:" + first.getPrice());
        House second = new House("black");
        System.out.println("HouseColor:" + second.getColor() + "\t" + "HousePrice:" + second.getPrice());
        House third = new House();
        System.out.println("HouseColor:" + third.getColor() + "\t" + "HousePrice:" + third.getPrice());
        //person 2
        Person hei = new Person();
        hei.setName("xiaohei");
        System.out.println("heiName:"+hei.getName());
        Person hong = new Person();
        hong.setName("xiao","hong");
        System.out.println("hongName:"+hong.getName());
        //student
        Student hua = new Student("xiaohua",21,98);
        System.out.println("studentName:"+hua.name+"\t"+"studentAge:"+hua.age+"\t"+"studentScore:"+hua.score);
    }
}
